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
public class AddNewborn extends Document {

    private String Newborn_Name;

    @Override
    public String toString() {
        return "AddNewborn{" + super.toString()+" "+ "Newborn_Name=" + Newborn_Name + ", Newborn_Dateof_Birth=" + Newborn_Dateof_Birth + ", Newborn_Gender=" + Newborn_Gender + '}';
    }

  
    private String Newborn_Dateof_Birth;
    private String Newborn_Gender;

    public AddNewborn(String Newborn_Name, String Newborn_Dateof_Birth, String Newborn_Gender, String Applicant_Name, String Applicant_ID, String Applicant_Address) {
        super(Applicant_Name, Applicant_ID, Applicant_Address);
        this.Newborn_Name = Newborn_Name;
        this.Newborn_Dateof_Birth = Newborn_Dateof_Birth;
        this.Newborn_Gender = Newborn_Gender;
    }

    public AddNewborn(String Applicant_Name, String Applicant_ID, String Applicant_Address) {
        super(Applicant_Name, Applicant_ID, Applicant_Address);
    }

    public AddNewborn() {
    }

    /**
     * @return the Newborn_Name
     */
    public String getNewborn_Name() {
        return Newborn_Name;
    }

    /**
     * @param Newborn_Name the Newborn_Name to set
     */
    public void setNewborn_Name(String Newborn_Name) {
        this.Newborn_Name = Newborn_Name;
    }

    /**
     * @return the Newborn_Dateof_Birth
     */
    public String getNewborn_Dateof_Birth() {
        return Newborn_Dateof_Birth;
    }

    /**
     * @param Newborn_Dateof_Birth the Newborn_Dateof_Birth to set
     */
    public void setNewborn_Dateof_Birth(String Newborn_Dateof_Birth) {
        this.Newborn_Dateof_Birth = Newborn_Dateof_Birth;
    }

    /**
     * @return the Newborn_Gender
     */
    public String getNewborn_Gender() {
        return Newborn_Gender;
    }

    /**
     * @param Newborn_Gender the Newborn_Gender to set
     */
    public void setNewborn_Gender(String Newborn_Gender) {
        this.Newborn_Gender = Newborn_Gender;
    }

}
