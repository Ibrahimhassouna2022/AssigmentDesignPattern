package observermain;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BackgroundColorWindow implements Observerable {

    Pane pane = new Pane();

    public Stage createStage() {
        Stage ColorOptionWind = new Stage();

        Scene sc = new Scene(pane, 200, 150);
        ColorOptionWind.setScene(sc);
        ColorOptionWind.setTitle("BackgroundColorWindow");
      
        ColorOptionWind.setWidth(400);
        ColorOptionWind.setHeight(350);
        ColorOptionWind.setX(1300);
        return ColorOptionWind;
    }

    @Override
    public void update(String color) {
        switch (color) {
            case "red":
                pane.setStyle("-fx-background-color:red;");
                break;
            case "green":
                pane.setStyle("-fx-background-color:green;");
                break;
            case "blue":
                pane.setStyle("-fx-background-color:blue;");
                break;
            default:
                pane.setStyle("-fx-background-color:white;");
                break;

        }
    }

}
