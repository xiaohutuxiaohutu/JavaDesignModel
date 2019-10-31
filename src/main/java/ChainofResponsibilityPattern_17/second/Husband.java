package ChainofResponsibilityPattern_17.second;

public class Husband extends Handler {
    public Husband() {
        super(2);
    }

    public void response(IWomen women) {
        System.out.println("--------􀾏􁄤􀧥􀏜􀻿􄇋􂼎-------");
        System.out.println(women.getRequest());
        System.out.println("􀏜􀻿􂱘􃄨􀻡􁰃􀋖􀧠􁛣\n");
    }
}
