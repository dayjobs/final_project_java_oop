package Fishes;
import java.awt.Color;
import java.awt.Graphics;

public class Goldfish extends Fish{
    private static int numGold = 0;

    public Goldfish(String name, int x, int y){
        super(name,"Goldfish", x, y);
        numGold ++;

    }

    @Override
    public void draw(Graphics g){
        g.setColor(new Color(255, 140, 0)); // Bright Dark Orange
        g.fillOval(x, y, 40, 25); // Body
        g.drawString(name, x, y - 5);
    }

}