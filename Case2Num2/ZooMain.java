public class ZooMain {
    public static void main(String[] args) 
    {
        Lion Leo = new Lion(5, "Leo", 300);
        Snake Ana = new Snake(5, "Ana", 50);
        Monkey George = new Monkey("kiwi", "George", 120);

        Leo.printAnimal();
        System.out.println("Leo Eats" + Leo.getMeatEaten() + " pounds of meat a day");

        Ana.printAnimal();
        System.out.println("Ana is" + Ana.getLength() + " feet long");
        
        George.printAnimal();
        System.out.println("George Eats" + George.getFavFood() + " as his favourite food");
    }
}
