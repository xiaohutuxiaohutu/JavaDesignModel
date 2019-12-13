package C6_AbstractFactoryPattern.init;

public abstract class AbstractBlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("black man laugh");
    }

    @Override
    public void cry() {
        System.out.println("black man cry");
    }

    @Override
    public void talk() {
        System.out.println("black man talk");
    }

}
