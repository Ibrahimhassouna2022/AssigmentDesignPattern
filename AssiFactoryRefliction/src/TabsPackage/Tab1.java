/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabsPackage;

import assifactoryrefliction.Tabs;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;

/**
 *
 * @author ABu_Alkhel
 */
public class Tab1 extends Tabs{

    @Override
    protected Tab createTab() {
        Label tabNam=new Label("This is Tab1....");
        Tab tab=new Tab ("Tab1");
        tab.setContent(tabNam);
        return tab;
    }

    

  

   

    
}
