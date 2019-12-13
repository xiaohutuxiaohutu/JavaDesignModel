package C6_AbstractFactoryPattern.init;

public abstract class AbstractYellowHuman implements Human {
    public void cry() {
        System.out.println("yellow man cyr");
    }

    public void laugh() {
        System.out.println("yellow man laugh");
    }

    public void talk() {
        System.out.println("yellow man takl");
    }
}
