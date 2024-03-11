package libraryManagementSystem;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patron patron = new Patron();
        Author author = new Author();
        Book book = new Book();

        int choice;

        do {
            try {
                System.out.println("\n1. New Patron Register\n2. New Author entry\n3. New Book Entry\n4. Transaction\n5. Exit");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        patron.setDetails();
                        System.out.println("Patron ID: " + patron.getPatronId());
                        System.out.println("Patron Name: " + patron.getPatronName());
                        System.out.println("Patron Email: " + patron.getPatronEmail());
                        System.out.println("Patron Phone Number: " + patron.getPatronPhoneNumber());
                        break;
                    case 2:
                        author.setAuthorDetails();
                        System.out.println("author name : "+author.getAuthorName());
                        System.out.println("author id : "+author.getAuthorId());

                        break;
                    case 3:
                        boolean validAuthorId = book.setBookDetails();
                        if(!validAuthorId) {
                            System.out.println("enter valid author Id");
                            continue;
                        }
                        System.out.println("book name :"+ book.getBookName());
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            } catch (NoSuchElementException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                choice = 0;
            }
        } while (choice != 5);
        scanner.close();
    }
}
