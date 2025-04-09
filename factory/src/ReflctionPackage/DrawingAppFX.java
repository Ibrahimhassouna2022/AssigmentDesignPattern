/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReflctionPackage;

import java.awt.Graphics;
import java.io.File;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author ABu_Alkhel
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;

public class DrawingAppFX extends Application {

    private DrawingManager manager = new DrawingManager();

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        int i=0;
        // لوحة الرسم
        Canvas canvas = new Canvas(500, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // لوحة الأزرار
        FlowPane buttonsPanel = new FlowPane();
        File shapeDir = new File("C:\\Users\\ABu_Alkhel\\Documents\\NetBeansProjects\\factory\\src\\Shapes");

        for (File shapeFile : shapeDir.listFiles()) {
            String shapeName = shapeFile.getName().split("\\.")[0];
            Button btn = new Button(shapeName+i);i++;
            btn.setOnAction(e -> {
                Shaps p = ReflectionFactory.shapAdd(shapeName);
                manager.drawShape(p, gc);
            });
            buttonsPanel.getChildren().add(btn);
        }

        // زر المسح
        Button clearBtn = new Button("Clear");
        clearBtn.setOnAction(e -> manager.clear(gc));

        // زر التراجع
//        Button undoBtn = new Button("Undo");
//        undoBtn.setOnAction(e -> manager.undo(gc));
        buttonsPanel.getChildren().addAll(clearBtn);

        // إضافة الأزرار ولوحة الرسم إلى واجهة المستخدم
        VBox topPanel = new VBox(buttonsPanel);
        root.setTop(topPanel);
        root.setCenter(canvas);

        Scene scene = new Scene(root, 600, 450);
        primaryStage.setTitle("Drawing App - JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// فئة DrawingManager لإدارة الرسم
class DrawingManager {

    public void drawShape(Shaps shape, GraphicsContext gc) {
        if (shape != null) {
            shape.drawShape(gc);
        }
    }

    public void clear(GraphicsContext gc) {
        gc.clearRect(0, 0, 500, 400);
    }

    public void undo(GraphicsContext gc) {
        // هنا يمكنك إضافة منطق التراجع في الرسم إذا كان هناك تخزين لتاريخ الأشكال المرسومة
        // كمثال، يمكن استخدام Stack لتخزين الأشكال التي تم رسمها
    }
}
