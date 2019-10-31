package C17_ChainofResponsibilityPattern.init;

public class Husband implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("wife request:" + women.getRequest());
        System.out.println("husban report:ok");
    }
}
