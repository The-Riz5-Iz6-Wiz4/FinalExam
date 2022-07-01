public class Snake extends Animal {
    private int snakeLength;

    public Snake(int length, String name, int weight)
    {

        super(name, weight);
        this.snakeLength = length;

    }

    public void setLength(int length)
    {
        this.snakeLength = length;
    }

    public int getLength()
    {
        return this.snakeLength;
    }
}
