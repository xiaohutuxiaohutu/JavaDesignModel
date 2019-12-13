package C11_BridgePattern.second;

public class Ipod extends Product {
    @Override
    public void beProducted() {
        System.out.println("make ipod");
    }

    @Override
    public void beSelled() {
        System.out.println("sell ipod");
    }
}
