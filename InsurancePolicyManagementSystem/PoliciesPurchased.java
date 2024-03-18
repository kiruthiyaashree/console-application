package InsurancePolicyManagementSystem;

import java.util.ArrayList;

public class PoliciesPurchased {
    private String name,policiyName,coverageType,keyFeatures;
    private int vendorId ;
    public static ArrayList<PoliciesPurchased> policiespurchasedList= new ArrayList<>();
    public void addDetails(String n,String pn,int vid,String ct,String kf)
    {
        name = n;
        policiyName =pn;
        vendorId =vid;
        coverageType =ct;
        keyFeatures =kf;
        policiespurchasedList.add(this);
    }
    public String getName()
    {
        return name;
    }
    public String getPoliciyname()
    {
        return policiyName;
    }
    public ArrayList<PoliciesPurchased> getPurchasedList()
    {
        return policiespurchasedList;
    }
}
