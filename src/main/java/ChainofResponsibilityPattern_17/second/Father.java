package ChainofResponsibilityPattern_17.second;

public class Father extends Handler {
    public Father() {
        super(1);
    }

    public void response(IWomen women) {
        System.out.println("--------􀽇􀜓􀧥􂠊􀒆􄇋􂼎-------");
        System.out.println(women.getRequest());
        System.out.println("􂠊􀒆􂱘􃄨􀻡􁰃:􀧠􁛣\n");
    }
}
