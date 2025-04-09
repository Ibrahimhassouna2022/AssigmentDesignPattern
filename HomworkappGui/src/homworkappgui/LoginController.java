/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homworkappgui;

import static homworkappgui.HomworkappGui.Cource;
import static homworkappgui.HomworkappGui.Login;
import static homworkappgui.HomworkappGui.Students;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ABu_Alkhel
 */
public class LoginController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void dashBoardStudent(ActionEvent event) throws IOException {
        Pane courceTableView = FXMLLoader.load(getClass().getResource("TableViewPane.fxml"));
        Map<String, Pane> mapPanes = new TreeMap<>();
        mapPanes.put("tableView", courceTableView);
        Stage Students1 = Students;
        Students1.setScene(new Scene(mapPanes.get("tableView")));
        Login.hide();
        Students1.show();

    }

    @FXML
    private void dashBoardCource(ActionEvent event) throws IOException {
        Pane courceTableView = FXMLLoader.load(getClass().getResource("TableViewCource.fxml"));
        Map<String, Pane> mapPanes = new TreeMap<>();
        mapPanes.put("TableView", courceTableView);
        Stage Cource1 = Cource;
        Cource1.setScene(new Scene(mapPanes.get("TableView")));
        Login.hide();
        Cource1.show();
    }

    @FXML
    private void dashBoardRegister(ActionEvent event) throws IOException {
        Pane registrationTableView = FXMLLoader.load(getClass().getResource("RegisterStu.fxml"));
        Map<String, Pane> mapPanes = new TreeMap<>();
        mapPanes.put("RegisterView", registrationTableView);

        // Create and show the Registration stage
        Stage registrationStage = new Stage(); // Create a new stage for Registration
        registrationStage.setScene(new Scene(mapPanes.get("RegisterView")));
        Login.hide(); // Hide the Login window
        registrationStage.show(); // Show the Registration window

    }

}
