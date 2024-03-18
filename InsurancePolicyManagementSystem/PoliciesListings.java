package InsurancePolicyManagementSystem;

import java.util.ArrayList;

public class PoliciesListings {
    ArrayList<AddPolices> list = AddPolices.policesList;
    public void DisplayList()
    {
        for(AddPolices policies:list)
        {
            System.out.println("name "+policies.getPolicyName());
            System.out.println("vendor "+policies.getVendorId());
            System.out.println("coverage "+policies.getCoverageType());
            System.out.println("exlusions "+policies.getExclusions());
            System.out.println("termsandconditions "+policies.getTermsAndConditions());
            System.out.println("heyfeatures "+policies.getKeyFeatures());
        }
    }
}
