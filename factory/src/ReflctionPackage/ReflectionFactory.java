package ReflctionPackage;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReflectionFactory {

    static Shaps shapAdd(String shap)   {
try{
        return (Shaps) Class.forName("Shapes."+shap).newInstance();
  } catch (InstantiationException ex) {
                Logger.getLogger(DrawingAppFX.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(DrawingAppFX.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (ClassNotFoundException ex) {
            Logger.getLogger(DrawingAppFX.class.getName()).log(Level.SEVERE, null, ex);
            }
         return null;
    }
    }

