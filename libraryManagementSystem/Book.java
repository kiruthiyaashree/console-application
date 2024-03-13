package libraryManagementSystem;

import java.util.ArrayList;
import java.util.Random;

public class Book {
    private int ISBN;
    private String name;
    private int publishedYear;
    private String genre,authorName;
    private boolean avaliablity;
    public static ArrayList<Book> books = new ArrayList<>();

    Random random = new Random();
    public Book(){
    }
    public Book(String name,String authorName,int publishedYear,String genre)
    {
        this.ISBN  =random.nextInt(1000);
        this.name = name;
        this.authorName = authorName;
        this.publishedYear=publishedYear;
        this.genre = genre;
        avaliablity = true;
       
    }
    public void setAvaliability(boolean a)
    {
        avaliablity = a;
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public int getBookISBN()
    {
        return ISBN;
    }
    public String getAuthorName()
    {
        return authorName;
    }
    public String getBookName()
    {
        return name;
    }
    public int getpublishedYear()
    {
        return publishedYear;
    }
    public String getBookGenre()
    {
        return genre;
    }
    public boolean getAvaliability()
    {
        return avaliablity;
    }
    public ArrayList<Book> getBookList()
    {
        return books;
    }
    public void removeBook(int isbnNumber)
    {
        for(int i=0;i<books.size();i++)
        {
            if(books.get(i).getBookISBN() == isbnNumber)
            {
                books.remove(i);
                return ;     
            }
        }
    }
}