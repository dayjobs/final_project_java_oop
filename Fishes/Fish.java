public abstract class Fish{
    protected String name;
    protected int movX, movY;
    protected int myFishHunger = 100;

    public Fish(string name, int x, int y){
        this.name = name;
        this.x = movX;
        this.y = movY;
    }

    public abstract void fishSwim();

    public void FeedFish(){
        this.myFishHunger = 100 - (this.myFishHunger +25);
    }
}