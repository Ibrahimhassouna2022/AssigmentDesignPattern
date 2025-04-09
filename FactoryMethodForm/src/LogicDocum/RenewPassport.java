/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicDocum;

/**
 *
 * @author ABu_Alkhel
 */
public class RenewPassport extends Document {

    private String OldPassport_Number;
    private String Passport_ExpiryDate;

    public RenewPassport(String OldPassport_Number, String Passport_ExpiryDate, String Applicant_Name, String Applicant_ID, String Applicant_Address) {
        super(Applicant_Name, Applicant_ID, Applicant_Address);
        this.OldPassport_Number = OldPassport_Number;
        this.Passport_ExpiryDate = Passport_ExpiryDate;
    }

    public RenewPassport() {
    }

    /**
     * @return the OldPassport_Number
     */
    public String getOldPassport_Number() {
        return OldPassport_Number;
    }

    /**
     * @param OldPassport_Number the OldPassport_Number to set
     */
    public void setOldPassport_Number(String OldPassport_Number) {
        this.OldPassport_Number = OldPassport_Number;
    }

    /**
     * @return the Passport_ExpiryDate
     */
    public String getPassport_ExpiryDate() {
        return Passport_ExpiryDate;
    }

     
    public void setPassport_ExpiryDate(String Passport_ExpiryDate) {
        this.Passport_ExpiryDate = Passport_ExpiryDate;
    }

}
