package Fishes;
public class ClownFish extends Fish{
    private static int numClownFish = 0;

    public ClownFish(String name , int x, int y){
        super(name, x, y);
        numClownFish ++;
    }

    @Override
    public void swim(){
        x += 3;
    }
}