package InsurancePolicyManagementSystem;

import java.util.ArrayList;

public abstract class Policies {
    public abstract String getPolicyName();
    public abstract int getVendorId();
    public abstract String getCoverageType();
    public abstract String getExclusions();
    public abstract String getTermsAndConditions();
    public abstract String getKeyFeatures();
    public abstract String getPremiumAmount();
    public abstract ArrayList<AddPolices> getPoliciesList();
}
