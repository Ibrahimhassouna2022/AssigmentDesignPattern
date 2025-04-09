/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicDocum;
public class Document {

    @Override
    public String toString() {
        return "Document{" + "Applicant_Name=" + Applicant_Name + ", Applicant_ID=" + Applicant_ID + ", Applicant_Address=" + Applicant_Address + '}';
    }

    private String Applicant_Name;
    private String Applicant_ID;
    private String Applicant_Address;

    public Document(String Applicant_Name, String Applicant_ID, String Applicant_Address) {
        this.Applicant_Name = Applicant_Name;
        this.Applicant_ID = Applicant_ID;
        this.Applicant_Address = Applicant_Address;
    }

    public Document() {
    }

    /**
     * @return the Applicant_Name
     */
    public String getApplicant_Name() {
        return Applicant_Name;
    }

    /**
     * @param Applicant_Name the Applicant_Name to set
     */
    public void setApplicant_Name(String Applicant_Name) {
        this.Applicant_Name = Applicant_Name;
    }

    /**
     * @return the Applicant_ID
     */
    public String getApplicant_ID() {
        return Applicant_ID;
    }

    /**
     * @param Applicant_ID the Applicant_ID to set
     */
    public void setApplicant_ID(String Applicant_ID) {
        this.Applicant_ID = Applicant_ID;
    }

    /**
     * @return the Applicant_Address
     */
    public String getApplicant_Address() {
        return Applicant_Address;
    }

    /**
     * @param Applicant_Address the Applicant_Address to set
     */
    public void setApplicant_Address(String Applicant_Address) {
        this.Applicant_Address = Applicant_Address;
    }

}
