import java.awt.Color;
import java.awt.Graphics;

public abstract class Fish{
    protected String name;
    protected String type;
    protected int movX, movY;
    

    public Fish(string name, String type, int x, int y){
        this.name = name;
        this.type = type;
        this.x = movX;
        this.y = movY;
    }

    public abstract void draw(Graphics g);

    
}