package libraryManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int role,choice;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("enter the role\n1.Admin\n2.Patron");
            role = scanner.nextInt();
            scanner.nextLine();

            if(role ==1 )
            {
                Admin admin = new Admin();
                System.out.println("enter the admin name");
                String adminName = scanner.nextLine();
                System.out.println("enter the admin password");
                String adminPassword = scanner.nextLine();
                boolean validAdmin = admin.validAdminLogin(adminName,adminPassword);
                if(!validAdmin)
                {
                    System.out.println("wrong admin credentials");
                }
                else{
                    //login with  credentials
                    //adding books
                    //search the books , authors , patrons , display book list
                    System.out.println("successfully admin logged in !");
                    Book book = new Book();
                    System.out.println("enter the choice\n1.add the book\n2.display the booklist\n3.search the book\n4.search author\n5.display the author list \n6.remove book");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            book.setBookDetails();
                            System.out.println(book.getBookName()+" "+book.getAuthorName());
                            break;
                    
                        default:
                            break;
                    }
                }
            }
            else{
                System.out.println("enter the choice\n1.Login\n2.Register");
                choice = scanner.nextInt();
                scanner.nextLine();
                Patron patron = new Patron();
                //display book list to search book , borrow it , retrun date validation 
                switch (choice) {
                    case 1:
                        System.out.println("enter the name");
                        String name = scanner.nextLine();
                        System.out.println("enter the password");
                        String password = scanner.nextLine();
                        boolean validPatron = patron.patronLogin(name, password);
                        if(!validPatron)
                        {
                            System.out.println("invalid user details");
                        }
                        else{
                            System.out.println("successfully logged in");
                            //Borrowing the books
                        }
                        break;
                    case 2:
                    //register
                        System.out.println("enter your name");
                        name = scanner.nextLine();
                        System.out.println("enter your password");
                        password = scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.next(); 
                        patron.setDetails(name,password, email, address, phoneNumber);
                        System.out.println(patron.getPatronName() + " "+ patron.getPatronId());
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }
        }
        }while(role != 3);
    }
}
