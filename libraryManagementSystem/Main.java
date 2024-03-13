package libraryManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int role,choice;
        String patronName ="";
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("-------------------------\nenter the role\n1.Admin\n2.Patron\n-----------------------");
            role = scanner.nextInt();
            scanner.nextLine();

            if(role ==1 )
            {
                Admin admin = new Admin();
                System.out.println("***********\nenter the admin name\n*************");
                String adminName = scanner.nextLine();
                System.out.println("***********\nenter the admin password\n********");
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
                    System.out.println("--------------------------------------------------------\nenter the choice\n1.add the book\n2.display the booklist\n3.search the book\n4.search author\n5.display the author list \n6.remove book\n7.Borrowed Book List\n----------------------------------------------------");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    Book book = new Book();
                    switch (choice) {
                        case 1:
                            System.out.println("enter the book name");
                            String name = scanner.nextLine();
                            System.out.println("enter the author name");
                            String authorName = scanner.nextLine();
                            System.out.println("enter the publisehd year");
                            int publishedYear = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("enter the genre");
                            String genre = scanner.nextLine();
                            Book newbook = new Book(name,authorName,publishedYear,genre);
                            book.addBook(newbook);
                            System.out.println("new book added successfully!");
                            break;
                        case 2:
                            ArrayList<Book> bookList = book.getBookList();
                            for(Book b:bookList)
                            {
                                System.out.println("book name : " + b.getBookName());
                            }
                            break;
                        case 3:
                            bookList = book.getBookList();
                            boolean avaliable = false;
                            System.out.println("enter the book name to be searched");
                            String searchBookName = scanner.nextLine();
                            for(Book b:bookList)
                            {
                                if(searchBookName.equals(b.getBookName()))
                                {
                                    avaliable = true;
                                    break;
                                }
                            }
                            if(avaliable) System.out.println("book is avaliable " + searchBookName );
                            else System.out.println("book is unavaliable" + searchBookName);
                            break;
                        case 4:
                            bookList = book.getBookList();
                            avaliable = false;
                            System.out.println("enter the author name to be searched");
                            String searchAuthorName = scanner.nextLine();
                            for(Book b:bookList)
                            {
                                if(searchAuthorName.equals(b.getAuthorName()) && b.getAvaliability())
                                {
                                    avaliable = true;
                                    break;
                                }
                            }
                            if(avaliable) System.out.println("author is avaliable " + searchAuthorName );
                            else System.out.println("author is unavaliable" + searchAuthorName);
                            break;
                        case 5:
                            bookList = book.getBookList();
                            for(Book b:bookList)
                            {
                                System.out.println("Author Name : " + b.getAuthorName());
                            }
                            break;
                        case 6:
                            System.out.println("enter the ISBN  number of the book to be removed : ");
                            int isbnnumber = scanner.nextInt();
                            book.removeBook(isbnnumber); 
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
                Book book = new Book();
                //display book list, to search book , borrow it , retrun date validation 
                switch (choice) {
                    case 1:
                        System.out.println("enter the name");
                        patronName = scanner.nextLine();
                        System.out.println("enter the password");
                        String password = scanner.nextLine();
                        boolean validPatron = patron.patronLogin(patronName, password);
                        if(!validPatron)
                        {
                            System.out.println("invalid user details");
                        }
                        else{
                            System.out.println("successfully logged in");
                            //Borrowing the books
                            ArrayList<Book> bookListForPatron = book.getBookList();
                            for(Book bookitem : bookListForPatron)
                            {
                                System.out.println("book name " + bookitem.getBookName());
                                System.out.println("book author " + bookitem.getAuthorName());
                                System.out.println("book publishtion year " + bookitem.getpublishedYear());
                                System.out.println("book genre " + bookitem.getBookGenre());
                                System.out.println("book avaliability " + bookitem.getAvaliability());
                            }
                            System.out.println("borrowing book name ");
                            String borrowingBookName = scanner.nextLine();
                            System.out.println("borrowing book author name ");
                            String borrowingBookAuthorName = scanner.nextLine();
                            System.out.println("borrowing book publication year ");
                            int BorrowingBookPubYear = scanner.nextInt();
                            scanner.nextLine();
                            // Inside the case 1 of patron's choice:
                            for (int i = 0; i < bookListForPatron.size(); i++) {
                                if (bookListForPatron.get(i).getBookName().equals(borrowingBookName) &&
                                    bookListForPatron.get(i).getAuthorName().equals(borrowingBookAuthorName) &&
                                    bookListForPatron.get(i).getpublishedYear() == BorrowingBookPubYear &&
                                    bookListForPatron.get(i).getAvaliability()) {

                                    Borrow borrow = new Borrow();
                                    borrow.setDetails(patronName,borrowingBookName, borrowingBookAuthorName, BorrowingBookPubYear, bookListForPatron.get(i).getBookGenre());
                                    borrow.addBorrowDetails();
                                    System.err.println("book borrowed successfully!");
                                    System.out.println("issue date : " + borrow.getIssueDate());
                                    System.out.println("return date : " + borrow.getReturnDate());
                                    bookListForPatron.get(i).setAvaliability(false); // Mark book as unavailable
                                }
                            }

                        }
                        break;
                    case 2:
                    //register
                        System.out.println("enter your name");
                        patronName = scanner.nextLine();
                        System.out.println("enter your password");
                        password = scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.next(); 
                        patron.setDetails(patronName,password, email, address, phoneNumber);
                        System.out.println(patron.getPatronName() + " "+ patron.getPatronId());
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }
        }
        }while(role != 3);
    }
}
