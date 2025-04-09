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
public class Rectangle extends Shaps {

    int width, height, posX, posY;
    Random r = new Random();

    public Rectangle() {
        this.width = 100;
        this.height = 50;
        this.posX = r.nextInt(400);
        this.posY = r.nextInt(250);
    }

    @Override
    public void drawShape(GraphicsContext g) {
        g.setFill(Color.GREEN);
        g.fillRect(posX, posY, width, height);
    }

}
