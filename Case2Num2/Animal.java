public class Animal {
    private String animalName;
    private int weight;

    public Animal(String name, int weight)
    {
        this.animalName = name;
        this.weight = weight;
    }

    //accessor methods
    public void setName(String name)
    {
        this.animalName = name;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public String getName()
    {
        return this.animalName;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public void printAnimal()
    {
        System.out.println("Animal's Name: " + this.animalName);
        System.out.println("weight(in pounds)" + this.weight);
    }
}
