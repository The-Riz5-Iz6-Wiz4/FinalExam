

public class BookMain{
    public static void main(String[] args) 
    {
        Book[] bookstore = Book[5];
        bookstore[0] = new Book("Raymond Bahana", "Superheroes are Real", 15.50, 1719);
        bookstore[1] = new Book("Nunung Nurul", "Falling in Love with Data Structures", 12.80, 1902);
        bookstore[2] = new Book("Ardimas Andi Purwita", "Secure My Network", 24.50, 2021);
        bookstore[3] = new Book("Jude Martinez", "Bakemonogatari", 9.50, 1996);

        for (int i = 0; i < bookstore.length; i++)
        {
            bookstore[i].printBookInfo();
        }
    }
}
