/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormDetaile;

import LogicDocum.AddNewborn;
import LogicDocum.Document;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author ABu_Alkhel
 */
public class AddNewbornForm extends FormDetaile {

    TextField newbornNameField, newbornDOBField, newbornGenderField;

    @Override
    protected VBox createSubAttrbut() {
        VBox vbox = new VBox();

        Label newbornNameLabel = new Label("Newborn Name:");
        newbornNameField = new TextField();
        Label newbornDOBLabel = new Label("Newborn Date of Birth:");
        newbornDOBField = new TextField();
        Label newbornGenderLabel = new Label("Newborn Gender:");
        newbornGenderField = new TextField();

        vbox.getChildren().addAll(newbornNameLabel, newbornNameField,
                newbornDOBLabel, newbornDOBField,
                newbornGenderLabel, newbornGenderField);

        return vbox;
    }

    @Override
    public Document CreateDoc() {
        AddNewborn a = new AddNewborn();

        a.setNewborn_Dateof_Birth(newbornDOBField.getText());
        a.setNewborn_Gender(newbornGenderField.getText());
        a.setNewborn_Name(newbornNameField.getText());
        System.out.println(a.toString());

        return a;
    }

}
