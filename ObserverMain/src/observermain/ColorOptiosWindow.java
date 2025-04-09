package observermain;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ColorOptiosWindow {

    String selectedColor;
    List<Observerable> lis = new ArrayList<>();

    void addListener(Observerable o) {
        if (o != null) {
            lis.add(o);

        }
    }

    ;
    void notification() {
        for (Observerable li : lis) {
            li.update(selectedColor);
        }
    }

    void setColor(String c) {
        this.selectedColor = c;
        notification();
    }

    public Stage createStage() {
        Stage ColorOptionWind = new Stage();
        Button red = new Button("red");
        Button green = new Button("green");
        Button blue = new Button("blue");
        red.setOnAction(value -> {
            setColor("red");
        });
        green.setOnAction(value -> {
            setColor("green");
        });
        blue.setOnAction(value -> {
            setColor("blue");
        });

        VBox vb = new VBox(30);
        vb.getChildren().addAll(red, green, blue);
        Scene sc = new Scene(vb, 200, 150);
        ColorOptionWind.setScene(sc);
        ColorOptionWind.setTitle("SelectColor");
        ColorOptionWind.setWidth(400);
        ColorOptionWind.setHeight(350);
        ColorOptionWind.setX(430); 

        return ColorOptionWind;
    }

}
