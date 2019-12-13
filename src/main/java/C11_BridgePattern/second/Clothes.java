package C11_BridgePattern.second;

public class Clothes extends Product {
    @Override
    public void beProducted() {
        System.out.println("make clothes");
    }

    @Override
    public void beSelled() {
        System.out.println("sell clothes");
    }
}
