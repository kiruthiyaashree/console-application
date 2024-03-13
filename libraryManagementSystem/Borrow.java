package libraryManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Borrow {
    private String bookName;
    private String authorName;
    private int publicationyear;
    private String genre,patronName;

    private String issue_date;
    private String return_data;

    private static ArrayList<Borrow> borrowDetails = new ArrayList<>();
    public void setDetails(String pn,String b,String a,int p,String g)
    {
        patronName=pn;
         bookName=b;
         authorName =a;
         publicationyear = p;
        genre = g;
        LocalDate localDate = LocalDate.now();
        issue_date = localDate.toString();
        LocalDate returnDate = localDate.plusDays(15);
        return_data = returnDate.toString();
    }
    public void addBorrowDetails()
    {
        borrowDetails.add(this);
    }
    public ArrayList<Borrow> getBorrowDetails()
    {
        return new ArrayList<>(borrowDetails);
    }
    public String getPatronName()
    {
        return patronName;
    }
    public String getIssueDate()
    {
        return issue_date;
    }
    public String getReturnDate()
    {
        return return_data;
    }
}
