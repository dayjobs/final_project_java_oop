package Fishes;
import java.awt.Color;
import java.awt.Graphics;

public class Betta extends Fish{
    private static int numBetta = 0;

    public Betta(String name, int x, int y){
        super(name,"Betta", x, y);
        numBetta ++;

    }

    @Override
    public void draw(Graphics g){
        g.setColor(Color.RED); // bettas are red
        g.fillOval(x, y, 40, 20); // creating the oval body of fish
        g.fillOval(x-15, y-5, 20, 30); // bettas have long fins so creating flowing fins
        g.drawString(name, x, y-5);
    }

}