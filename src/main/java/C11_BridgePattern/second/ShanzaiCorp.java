package C11_BridgePattern.second;

public class ShanzaiCorp extends Corp {
    public ShanzaiCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("shanzai corp make money");
    }
}
