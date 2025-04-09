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
public class Courc {
    private int cid;

    public Courc() {
    }

    public Courc(int cid) {
        this.cid = cid;
    }

    public Courc(int cid, String name, String room) {
        this.cid = cid;
        this.name = name;
        this.room = room;
    }
    private String name;
    private String room;

    /**
     * @return the cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(int cid) {
        this.cid = cid;
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
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }
    
}
