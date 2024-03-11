package libraryManagementSystem;

import java.util.Scanner;

public class Patron {
    private String name;
    private int id;
    private String email;
    private String address,phoneNumber;
    private static int nextId=0;

    public void setDetails()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter email: ");
        email = scanner.nextLine();
        System.out.print("Enter address: ");
        address = scanner.nextLine();
        System.out.print("Enter phone number: ");
        phoneNumber = scanner.next();
        this.id = nextId++;
        // scanner.close();
    }
    public String getPatronName()
    {
        return name;
    }
    public String getPatronEmail()
    {
        return email;
    }
    public String getPatronAddress()
    {
        return address;
    }
    public String getPatronPhoneNumber()
    {
        return phoneNumber;
    }
    public int getPatronId()
    {
        //returning patron id 
        return id;
    }
}
