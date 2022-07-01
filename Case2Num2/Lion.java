public class Lion extends Animal {
    private int meatEaten;

    public Lion(int meatEaten, String name, int weight)
    {

        super(name, weight);
        this.meatEaten = meatEaten;

    }

    public void setMeatEaten(int meatWeight)
    {
        this.meatEaten = meatWeight;
    }

    public int getMeatEaten()
    {
        return this.meatEaten;
    }
    
}
