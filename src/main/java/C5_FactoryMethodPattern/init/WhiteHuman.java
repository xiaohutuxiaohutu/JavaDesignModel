package C5_FactoryMethodPattern.init;

public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("white laugh");
    }

    @Override
    public void cry() {
        System.out.println("white cry");
    }

    @Override
    public void talk() {
        System.out.println("white talk");
    }
}
