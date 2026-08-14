package Fishes;
public class Betta extends Fish{
    private static int numBetta = 0;

    public Betta(String name, int x, int y){
        super(name, x, y);
        numBetta ++;

    }

    @Override
    public void swim(){
        x += 3;
    }

}