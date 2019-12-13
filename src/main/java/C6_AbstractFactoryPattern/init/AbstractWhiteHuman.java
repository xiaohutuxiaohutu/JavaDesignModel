package C6_AbstractFactoryPattern.init;

public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("white man lauth");
    }

    @Override
    public void cry() {
        System.out.println("white man cry");
    }

    @Override
    public void talk() {
        System.out.println("white man talk");
    }

}
