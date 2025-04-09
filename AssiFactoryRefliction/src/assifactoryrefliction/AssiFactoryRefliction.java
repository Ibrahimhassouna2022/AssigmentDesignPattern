/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assifactoryrefliction;

import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 *
 * @author ABu_Alkhel
 */
public class AssiFactoryRefliction extends Application{

   
    public static void main(String[] args) {
        launch(args);
 
         
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       File f=new File("C:\\Users\\ABu_Alkhel\\Documents\\NetBeansProjects\\AssiFactoryRefliction\\src\\TabsPackage");
        TabPane tb=new TabPane( );
       for (File file : f.listFiles()) {
         String tabName=file.getName().split("\\.")[0];
         Tabs t= Factory.addedYTap(tabName);
         Tab tab=t.createTab();
           tb.getTabs().add(tab);
         }
        Scene s=new Scene(tb,500,400);
         primaryStage.setScene(s);
          primaryStage.setTitle("FIrts");
         primaryStage.show();
         
         
    
       
    
    }
    
}
