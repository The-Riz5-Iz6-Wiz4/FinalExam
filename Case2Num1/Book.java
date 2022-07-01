public class Book {
    private String bookTitle;
    private double price;
    private int yearPublished;
    private String authorName;

    public Book(String title, String authorName, double price, int yearPublished)
    {
        this.bookTitle = title;
        this.price = price;
        this.yearPublished = yearPublished;
        this.authorName = authorName;
    }

    //accessor methods
    public void setTitle(String title)
    {
        this.bookTitle = title;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setYear(int year)
    {
        this.yearPublished = year;
    }

    public void setAuthor(String name)
    {
        this.authorName = name;
    }

    public String getTitle()
    {
        return this.bookTitle;
    }

    public double getPrice()
    {
        return this.price;
    }

    public int getYear()
    {
        return this.yearPublished;
    }

    public String getAuthor()
    {
        return this.authorName;
    }

    public void printBookInfo()
    {
        System.out.println("Book Name: " + this.bookTitle);
        System.out.println("Price: $" + this.price);
        System.out.println("Year of publication: " + this.yearPublished);
        System.out.println("Author's name: " + this.authorName);
    }

}
