package InsurancePolicyManagementSystem;

import java.util.ArrayList;

public class PoliciesPurchase {
    private int policiesPurchasenumber;
    private String name,password;
    public PoliciesPurchase()
    {
        
    }
    public PoliciesPurchase(String n,String p,int num)
    {
        name =n;
        password =p;
        policiesPurchasenumber = num;
    }
    PoliciesPurchased policiesPurchased = new PoliciesPurchased();
    AddPolices addPolices = new AddPolices();
    ArrayList<AddPolices> pl = addPolices.getPoliciesList();
    for(int i=0;i<pl.size();i++)
    {
        if(i == policiesPurchasenumber)
        {
            policiesPurchased.addDetails(name,pl.get(i).getPolicyName(),pl.get(i).getVendorId(),pl.get(i).getCoverageType(),pl.get(i).getKeyFeatures());
        }
    }

}
