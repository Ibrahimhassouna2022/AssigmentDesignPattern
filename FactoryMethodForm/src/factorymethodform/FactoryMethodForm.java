/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodform;

import FormDetaile.AddNewbornForm;
import FormDetaile.RenewPassportForm;
import FormDetaile.TravelVisaForm;
import LogicDocum.Document;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author ABu_Alkhel
 */
public class FactoryMethodForm extends Application {
 

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button addNewbornButton = new Button("Add Newborn");
        Button renewPassportButton = new Button("Renew Passport");
        Button travelVisaButton = new Button("Travel Visa");

        VBox formContainer = new VBox();
        formContainer.setSpacing(10);

        addNewbornButton.setOnAction(e -> {
            formContainer.getChildren().clear();
            AddNewbornForm form = new AddNewbornForm();
            formContainer.getChildren().add(form.getForm());
        });

        renewPassportButton.setOnAction(e -> {
            formContainer.getChildren().clear();
            RenewPassportForm form = new RenewPassportForm();
            formContainer.getChildren().add(form.getForm());
        });

        travelVisaButton.setOnAction(e -> {
            formContainer.getChildren().clear();
            TravelVisaForm form = new TravelVisaForm();
            formContainer.getChildren().add(form.getForm());
        });
        HBox buttons = new HBox(addNewbornButton, renewPassportButton, travelVisaButton);
        buttons.setSpacing(10);

        VBox root = new VBox(buttons, formContainer);
        root.setSpacing(20);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Dynamic Form Generator");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
