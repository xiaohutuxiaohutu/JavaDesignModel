package ChainofResponsibilityPattern_17.init;

public class Father implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("WOMEN REQUEST:" + women.getRequest());
        System.out.println("father:ok");
    }
}
