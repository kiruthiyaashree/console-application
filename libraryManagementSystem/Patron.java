package libraryManagementSystem;

import java.util.HashMap;

public class Patron {
    private String name;
    private int id;
    private String email;
    private String address,phoneNumber,password;
    private static int nextId=0;
    public static HashMap<String,String> credentials = new HashMap<>();
    public void setDetails(String n,String p,String email,String addr,String phn)
    {
        this.name = n;
        this.password = p;
        this.email = email;
        this.address =addr;
        this.phoneNumber = phn;
        credentials.put(name,p);
        
        this.id = nextId++;
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
        return id;
    }
    public boolean patronLogin(String name,String password)
    {
        String passVerification = credentials.get(name);
        if( passVerification == null || !passVerification.equals(password))
        {
            return false;
        }
        return true;
    }
}
