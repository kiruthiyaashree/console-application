package InsurancePolicyManagementSystem;

public class Vendors {
    private int vendorId;
    private String PolicyName;
    private String vendorName;
    private long VendorcontactNumber;
    private String email;
    private int id =0;
    public void setVendorDetails(String pname,String vname,long cn,String e)
    {
        PolicyName=pname;
        vendorName = vname;
        VendorcontactNumber= cn;
        email=e;
        this.vendorId = id++;
    }
}
