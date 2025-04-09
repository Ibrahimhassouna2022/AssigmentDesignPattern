/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homworkappgui;

import java.util.Map;
import java.util.TreeMap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HomworkappGui extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    static Stage Login = new Stage();
    static Stage Cource = new Stage();
    static Stage Students = new Stage();
     static Stage Registerion = new Stage();


    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane paneTableView = FXMLLoader.load(getClass().getResource("Login.fxml"));
//       Pane courceTableView = FXMLLoader.load(getClass().getResource("TableView.fxml"));

        Map<String, Pane> mapPanes = new TreeMap<>();
        mapPanes.put("tableView", paneTableView);
//         mapPanes.put("tableView", courceTableView);
        Scene scene = new Scene(mapPanes.get("tableView"));
        Login.setTitle("Streams and Database App");
        Login.setScene(scene);
        Login.show();
    }

}
