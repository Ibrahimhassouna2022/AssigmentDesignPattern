package Shapes;

 

import ReflctionPackage.Shaps;
import java.awt.Graphics;
import java.util.Random;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author ABu_Alkhel
 */
public class Triangle extends Shaps {
   Random r = new Random();
    int x1, y1;

    public Triangle() {
        x1 = r.nextInt(300);
        y1 = r.nextInt(300);
    }

    @Override
    public void drawShape(GraphicsContext g) {
        g.setFill(Color.RED);
        g.fillPolygon(new double[]{x1, x1 + 50, x1 - 50}, new double[]{y1, y1 + 50, y1 + 50}, 3);
    }
    
}
