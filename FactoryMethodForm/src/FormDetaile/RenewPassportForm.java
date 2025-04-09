/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormDetaile;

import LogicDocum.Document;
import LogicDocum.RenewPassport;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author ABu_Alkhel
 */
public class RenewPassportForm extends FormDetaile {

    TextField OldPassport_Number, Passport_ExpiryDate;

    @Override
    public VBox createSubAttrbut() {
        Label OldPassport_Numberla = new Label("OldPassport Number");
        OldPassport_Number = new TextField();
        VBox v1 = new VBox(OldPassport_Numberla, OldPassport_Number);
        Label Passport_ExpiryDatela = new Label("Passport_ExpiryDate");
        Passport_ExpiryDate = new TextField();
        VBox v2 = new VBox(Passport_ExpiryDatela, Passport_ExpiryDate);

        HBox h1 = new HBox(v1, v2);
        VBox main = new VBox(h1);

        return main;

    }

    @Override
    public Document CreateDoc() {
        RenewPassport r = new RenewPassport();
        r.setOldPassport_Number(OldPassport_Number.getText());
        r.setPassport_ExpiryDate(Passport_ExpiryDate.getText());
        return r;

    }

}
