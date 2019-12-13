package C5_FactoryMethodPattern.init;

public class YellowHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("yellow laugh");
    }

    @Override
    public void cry() {
        System.out.println("yellow cry");
    }

    @Override
    public void talk() {
        System.out.println("yellow talk");
    }
}
