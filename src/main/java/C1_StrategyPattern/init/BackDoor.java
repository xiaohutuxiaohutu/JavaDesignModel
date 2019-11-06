package C1_StrategyPattern.init;

public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("策略一");
    }
}
