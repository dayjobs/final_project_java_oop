package Fishes;
import java.awt.Graphics;

public abstract class Fish{
    protected String name;
    protected String type;
    protected int x,y;
    

    public Fish(String name, String type, int x, int y){
        this.name = name;
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);

    
}