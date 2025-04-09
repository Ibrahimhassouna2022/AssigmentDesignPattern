/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homworkappgui;

/**
 *
 * @author ABu_Alkhel
 */
public class Student {

    public Student() {
    }
    private int sid;
    private String name;
    private double major;

    public Student(int sid, String name, double major) {
        this.sid = sid;
        this.name = name;
        this.major = major;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the major
     */
    public double getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(double major) {
        this.major = major;
    }
}
