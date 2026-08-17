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
        g.setColor(Color.CYAN);
        g.fillOval(x, y, 30, 15); // Smaller body
        int[] xTail = {x, x - 15, x - 15};
        int[] yTail = {y + 7, y - 3, y + 17};
        g.fillPolygon(xTail, yTail, 3); // Triangular tail
        g.drawString(name, x, y - 5);
    }
}



