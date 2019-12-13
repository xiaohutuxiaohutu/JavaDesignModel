package C11_BridgePattern.init;

public class HouseCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("build house");
    }

    @Override
    protected void shell() {
        System.out.println("sell house");
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("make money");
    }
}
