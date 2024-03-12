package libraryManagementSystem;

public class Admin {
    private String adminName = "k@admin";
    private String adminPassword = "1234admin";

    public boolean validAdminLogin(String n,String p)
    {
        if(!adminName.equals(n) || !adminPassword.equals(p)){
            return false;
        }
        return true;
    }
}
