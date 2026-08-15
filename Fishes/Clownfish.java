package Fishes;
import java.awt.Color;
import java.awt.Graphics;

public class Clownfish extends Fish{
    private static int numClownfish = 0;

    public Clownfish(String name , int x, int y){
        super(name, "Clownfish", x, y);
        numClownfish ++;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillOval(x,y,45,25); // creating orange body
        g.setColor(Color.WHITE); // white lines on clownfish
        g.fillRect(x+15,y,10,25); // creating lines 
        g.drawString(name, x, y-5);
    }
}