package C11_BridgePattern.init;

public class ClothesCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("make clothes");
    }

    @Override
    protected void shell() {
        System.out.println("sell clothes");
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("make money");
    }
}
