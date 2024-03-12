package libraryManagementSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Book {
    private int ISBN;
    private String name;
    private int publishedYear;
    private String genre,authorName;
    public static ArrayList<Integer> bookISBNs = new ArrayList<>();
    public static ArrayList<String> bookNamesList = new ArrayList<>();
    public static ArrayList<String> authorNameList = new ArrayList<>();
    Random random = new Random();
    public void setBookDetails()
    {
        Scanner sc = new Scanner(System.in);
        this.ISBN  =random.nextInt(1000);
        bookISBNs.add(ISBN);
        System.out.println("enter the book name");
        name = sc.nextLine();
        bookNamesList.add(name);
        System.out.println("enter the author name");
        authorName = sc.nextLine();
        authorNameList.add(authorName);
        System.out.println("enter the publisehd year");
        publishedYear = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the genre");
        genre = sc.nextLine();
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
    public int publishedYear()
    {
        return publishedYear;
    }
    public String getBookGenre()
    {
        return genre;
    }
}