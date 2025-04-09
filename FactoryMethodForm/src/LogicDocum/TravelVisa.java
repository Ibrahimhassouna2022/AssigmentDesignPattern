/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicDocum;

public class TravelVisa extends Document {

    private String Travel_Destination;
    private String Travel_Date;
    private String Travel_Duration;

    

    /**
     * @return the Travel_Destination
     */
    public String getTravel_Destination() {
        return Travel_Destination;
    }

    public TravelVisa( ) {
     }

    /**
     * @param Travel_Destination the Travel_Destination to set
     */
    public void setTravel_Destination(String Travel_Destination) {
        this.Travel_Destination = Travel_Destination;
    }

    /**
     * @return the Travel_Date
     */
    public String getTravel_Date() {
        return Travel_Date;
    }

    /**
     * @param Travel_Date the Travel_Date to set
     */
    public void setTravel_Date(String Travel_Date) {
        this.Travel_Date = Travel_Date;
    }

    /**
     * @return the Travel_Duration
     */
    public String getTravel_Duration() {
        return Travel_Duration;
    }

    /**
     * @param Travel_Duration the Travel_Duration to set
     */
    public void setTravel_Duration(String Travel_Duration) {
        this.Travel_Duration = Travel_Duration;
    }
}
