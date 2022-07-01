public class Monkey extends Animal {
    private String favFood;

    public Monkey(String favFood, String name, int weight)
    {
        super(name, weight);
        this.favFood = favFood;
    }

    public void setFavFood(String favFood)
    {
        this.favFood = favFood;
    }

    public String getFavFood()
    {
        return this.favFood;
    }
}
