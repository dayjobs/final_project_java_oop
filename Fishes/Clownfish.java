package Fishes;
public class ClownFish extends Fish{
    private static int numClownFish = 0;

    public ClownFish(String name , int x, int y){
        super(name, "Clownfish", x, y);
        numClownFish ++;
    }

    @Override
    public void draw(Graphic g){
        g.setColor(Color.ORANGE);
        g.fillOval(x,y,45,25); // creating orange body
        g.setColor(Color.WHITE); // white lines on clownfish
        g.fillRect(x+15,y,10,25); // creating lines 
        g.drawString(name, x, y-5);
    }
}