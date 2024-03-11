package libraryManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Author {
    private int id;
    private String name;
    private String nationality;
    private int nextId=0;
    public static ArrayList<Integer> authorIds = new ArrayList<>();
    public void setAuthorDetails()
    {
        Scanner sc = new Scanner(System.in);
        this.id  = nextId++;
        authorIds.add(id);
        System.out.println("enter the author name");
        name = sc.nextLine();
        System.out.println("enter the nationality of author");
        nationality = sc.nextLine();
    }
    public int getAuthorId()
    {
        return id;
    }
    public String getAuthorName()
    {
        return name;
    }
    public String getAuthorNationality()
    {
        return nationality;
    }
}
