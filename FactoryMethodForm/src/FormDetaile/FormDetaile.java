/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormDetaile;

//import factorymethodform.FactoryMethodForm;
//import static factorymethodform.FactoryMethodForm.SetStageData;
import LogicDocum.Document;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public abstract class FormDetaile {

    VBox main;


    TextField applicantNameField, applicantIDField, applicantAddressField;
    Button saveButton;

    private VBox createSharedFields() {
        VBox vbox = new VBox();

        Label applicantNameLabel = new Label("Applicant Name:");
        applicantNameField = new TextField();
        Label applicantIDLabel = new Label("Applicant ID:");
        applicantIDField = new TextField();
        Label applicantAddressLabel = new Label("Applicant Address:");
        applicantAddressField = new TextField();

        vbox.getChildren().addAll(applicantNameLabel, applicantNameField,
                applicantIDLabel, applicantIDField,
                applicantAddressLabel, applicantAddressField);

        return vbox;

    }
 
    abstract VBox createSubAttrbut();

    public FormDetaile() {
      
        VBox vbox = new VBox();

        Label applicantNameLabel = new Label("Applicant Name:");
        applicantNameField = new TextField();
        Label applicantIDLabel = new Label("Applicant ID:");
        applicantIDField = new TextField();
        Label applicantAddressLabel = new Label("Applicant Address:");
        applicantAddressField = new TextField();

        vbox.getChildren().addAll(applicantNameLabel, applicantNameField,
                applicantIDLabel, applicantIDField,
                applicantAddressLabel, applicantAddressField);
          saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            Document dd = CreateDoc();
            dd.setApplicant_ID(applicantIDField.getText());
            System.out.println("-----------------"+applicantIDField.getText());
            dd.setApplicant_Name(applicantNameField.getText());
            dd.setApplicant_Address(applicantAddressField.getText());
            showSuccessMessage();
        });  
        main = new VBox(vbox, createSubAttrbut(), saveButton);
    }

    public VBox getForm() {
        return main;
    }

    public abstract Document CreateDoc();

    public void showSuccessMessage() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Submission Success");
        alert.setHeaderText(null);
        alert.setContentText("Form submitted successfully!");
        alert.showAndWait();
    }
}
