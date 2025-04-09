/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observermain;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author ABu_Alkhel
 */
public class TextDisplayWindow implements Observerable {

    Label labelColor = new Label("none");

    public Stage createStage() {
        Stage ColorOptionWind = new Stage();
        VBox vb = new VBox(labelColor);
        vb.setStyle("-fx-Padding:10px;-fx-alignment:center;");
        Scene sc = new Scene(vb, 200, 150);
        ColorOptionWind.setScene(sc);
        
        ColorOptionWind.setWidth(400);
        ColorOptionWind.setHeight(350);
        ColorOptionWind.setX(860);

        ColorOptionWind.setTitle("TextDisplayWindow");
        return ColorOptionWind;
    }

    @Override
    public void update(String color) {
        labelColor.setText("Selected Color:: " + color);
    }

}
