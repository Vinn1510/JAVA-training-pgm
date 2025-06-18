abstract class Insurance {
    String policyHolder;
    String policyType;

   
    Insurance(String policyHolder, String policyType) {
        this.policyHolder = policyHolder;
        this.policyType = policyType;
    }

    
    abstract void showPolicyDetails();

    
    void companyInfo() {
        System.out.println("Company: ABC Life Insurance Pvt. Ltd.");
    }
}


class InsuranceAgent extends Insurance {
    int policyNumber;

    InsuranceAgent(String policyHolder, String policyType, int policyNumber) {
        super(policyHolder, policyType);
        this.policyNumber = policyNumber;
    }

   
    void showPolicyDetails() {
        System.out.println("Policy Holder Name : " + policyHolder);
        System.out.println("Policy Type         : " + policyType);
        System.out.println("Policy Number       : " + policyNumber);
    }
}


public class Main {
    public static void main(String[] args) {
        InsuranceAgent agent = new InsuranceAgent("Ravi Kumar", "Health Insurance", 456789);
        agent.companyInfo();         
        agent.showPolicyDetails();   
}