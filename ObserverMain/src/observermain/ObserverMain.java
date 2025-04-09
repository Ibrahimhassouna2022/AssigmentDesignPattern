/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observermain;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author ABu_Alkhel
 */
public class ObserverMain extends Application{

   
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ColorOptiosWindow colorS=new ColorOptiosWindow();
        BackgroundColorWindow ba=new BackgroundColorWindow();
        TextDisplayWindow t=new TextDisplayWindow();
        colorS.addListener(t);
        colorS.addListener(ba);
        colorS.createStage().show();
        ba.createStage().show();
        t.createStage().show();
        
     }
    
}
