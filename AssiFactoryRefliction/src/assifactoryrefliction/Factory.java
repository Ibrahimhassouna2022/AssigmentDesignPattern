/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assifactoryrefliction;

import static java.lang.Class.forName;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ABu_Alkhel
 */
public class Factory {
    public static  Tabs addedYTap(String nameTab){
   try{
        return (Tabs) Class.forName("TabsPackage."+nameTab).newInstance();
  } catch (Exception ex) {
               ex.printStackTrace();
  }
           
         return null;
    }
}
