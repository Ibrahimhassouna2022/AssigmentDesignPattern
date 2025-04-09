/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormDetaile;

import LogicDocum.Document;
import LogicDocum.TravelVisa;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author ABu_Alkhel
 */
public class TravelVisaForm extends FormDetaile {

    TextField Travel_Destination, Travel_Date, Travel_Duration;

    @Override
    public VBox createSubAttrbut() {

        Label Travel_Destinationla = new Label("Travel_Destination");
        Travel_Destination = new TextField();
        VBox v1 = new VBox(Travel_Destinationla, Travel_Destination);
        Label Travel_Datela = new Label("Travel_Date");
        Travel_Date = new TextField();
        VBox v2 = new VBox(Travel_Datela, Travel_Date);

        Label Travel_Durationla = new Label("Travel_Duration");
        Travel_Duration = new TextField();
        VBox v3 = new VBox(Travel_Durationla, Travel_Duration);
        HBox h1 = new HBox(v1, v2);

        VBox main = new VBox(h1, v3);

        return main;

    }

    @Override
    public Document CreateDoc() {
        TravelVisa t = new TravelVisa();
        t.setTravel_Date(Travel_Date.getText());
        t.setTravel_Destination(Travel_Destination.getText());
        t.setTravel_Duration(Travel_Duration.getText());
        return t;
    }

}
