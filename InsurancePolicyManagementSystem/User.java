package InsurancePolicyManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class User {
    private String name="user",password="1234",email;
    public static HashMap<String,String> user = new HashMap<>();
    public void add()
    {
        user.put(name,password);
    }
    public boolean validUser(String n,String pw)
    {
        if(user.containsKey(n) && user.containsValue(pw))
        {
            return true;
        }
        return false;
    }
}
