package C1_StrategyPattern.init;

public class GivenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("strategy 2");
    }
}
