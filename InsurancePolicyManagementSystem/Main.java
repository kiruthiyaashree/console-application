package InsurancePolicyManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
    int role;
    Scanner sc = new Scanner(System.in);
    role = sc.nextInt();
    if(role  == 1)
    {
         String name  = sc.nextLine();
         String coverageType = sc.nextLine();
         String Exclusions =sc.nextLine();
         String TermsAdnConditions= sc.nextLine();
         String keyfeatures = sc.nextLine();
         String premiumAmount =sc.nextLine();
         int vendorId =sc.nextInt();
         AddPolices addPolices = new AddPolices(name,coverageType,Exclusions,TermsAdnConditions,keyfeatures,vendorId,premiumAmount);
    }
    else{
        String un = sc.nextLine();
        String pw = sc.nextLine();
        User u = new User();
        u.add();
        boolean validuser = u.validUser(un, pw);
        if(validuser){
            PoliciesPurchased ppd = new PoliciesPurchased();
            ArrayList<PoliciesPurchased> ppdl = ppd.getPurchasedList();
            for(PoliciesPurchased p: ppdl)
            {
                System.out.println(p.getName());
                System.out.println(p.getPoliciyname());
            }
            System.out.println("enter the choice \n1.policy listings and details\n2.purchase \n3.policy search and comparision");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    PoliciesListings poloListings = new PoliciesListings();
                    poloListings.DisplayList();
                    break;
                case 2:
                    System.out.println("purchase the policies");
                    int policyNum=sc.nextInt();
                    //purchase policy
                    PoliciesPurchase policiesPurchased = new PoliciesPurchase(un,pw,policyNum);
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
    }
    }
}
