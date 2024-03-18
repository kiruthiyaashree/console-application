package InsurancePolicyManagementSystem;

import java.util.ArrayList;

public class AddPolices extends Policies{
    private String name,coverageType,Exclusions,TermsAdnConditions,keyfeatures,premiumAmount;
    private int vendorId;
    public static ArrayList<AddPolices> policesList = new ArrayList<>();
    public AddPolices()
    {

    }
    public AddPolices(String n,String c,String e,String t,String kf,int vid,String prem)
    {
        name =n;
        coverageType =c;
        Exclusions =e;
        TermsAdnConditions =t;
        keyfeatures =kf;
        vendorId =vid;
        premiumAmount = prem;
        policesList.add(this);
    }
    public String getPremiumAmount()
    {
        return premiumAmount;
    }
    public String getPolicyName()
    {
        return name;
    }
    public int getVendorId()
    {
        return vendorId;
    }
    public  String getCoverageType(){
        return coverageType;
    }
    public  String getExclusions(){
        return Exclusions;
    }
    public  String getTermsAndConditions(){
        return TermsAdnConditions;
    }
    public  String getKeyFeatures(){
        return keyfeatures;
    }
    public ArrayList<AddPolices> getPoliciesList()
    {
        return new ArrayList<>(policesList);
    }
}
