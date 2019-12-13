package C11_BridgePattern.second;

public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这样额");
    }

    @Override
    public void beSelled() {
        System.out.println("生产的房子卖出去了");
    }
}
