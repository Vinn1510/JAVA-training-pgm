
interface PolicyDetails {
    default void showPolicyType() {
        System.out.println("Policy Type: Life Insurance");
    }
    
    void calculatePremium();
}


abstract class InsuranceAgent {
    String agentName;
    int agentId;

    InsuranceAgent(String name, int id) {
        this.agentName = name;
        this.agentId = id;
    }

    void displayAgentInfo() {
        System.out.println("Agent Name: " + agentName);
        System.out.println("Agent ID: " + agentId);
    }


    abstract void sellPolicy();
}


class Test extends InsuranceAgent implements PolicyDetails {

    Test(String name, int id) {
        super(name, id);
    }


    void sellPolicy() {
        System.out.println(agentName + " is selling a life insurance policy.");
    }


    public void calculatePremium() {
        System.out.println("Calculated Premium: ₹10,000 per annum");
    }

    public static void main(String[] args) {
        Test agent = new Test("Ravi", 101);
        agent.displayAgentInfo();
        agent.showPolicyType();      
        agent.calculatePremium();     
        agent.sellPolicy();           
    }
}
