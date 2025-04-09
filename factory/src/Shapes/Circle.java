package Shapes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import ReflctionPackage.Shaps;
 import java.awt.Graphics;
import java.util.Random;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author ABu_Alkhel
 */
public class Circle extends Shaps{
public int radius, centerX, centerY;
    Random r = new Random();

    public Circle() {
        this.radius = 50;
        this.centerX = r.nextInt(400);
        this.centerY = r.nextInt(250);
    }

    @Override
    public void drawShape(GraphicsContext g) {
        g.setFill(Color.BLUE);
        g.fillOval(centerX, centerY, radius * 2, radius * 2);
    }
 

    
    
}
