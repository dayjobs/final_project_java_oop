package Fishes;
import java.awt.Color;
import java.awt.Graphics;

public class Guppy extends Fish{
    private static int numGuppy = 0;

    public Guppy(String name, int x, int y){
        super(name,"Guppy", x, y);
        numGuppy ++;

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



