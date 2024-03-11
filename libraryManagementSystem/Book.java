package libraryManagementSystem;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Book {
    private int ISBN;
    private String name;
    private int publishedYear;
    private String genre;
    private int authorid ;
    private boolean invalidAuthorId=true;
    Random random = new Random();
    public boolean setBookDetails()
    {
        Scanner sc = new Scanner(System.in);
        this.ISBN  =random.nextInt(1000);
        System.out.println("enter the book name");
        name = sc.nextLine();
        System.out.println("enter the publisehd year");
        publishedYear = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the genre");
        genre = sc.nextLine();
        System.out.println("enter the author id");
        authorid = sc.nextInt();
        sc.nextLine();
        if(!Author.authorIds.contains(authorid))
        {
            invalidAuthorId = false;
        }
        return invalidAuthorId;
    }
    public int getBookISBN()
    {
        return ISBN;
    }
    public String getBookName()
    {
        return name;
    }
    public int publishedYear()
    {
        return publishedYear;
    }
    public String getBookGenre()
    {
        return genre;
    }
}