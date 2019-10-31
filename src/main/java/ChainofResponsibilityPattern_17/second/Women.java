package ChainofResponsibilityPattern_17.second;

public class Women implements IWomen {
    private int type = 0;
    private String request = "";

    public Women(int _type, String _request) {
        this.type = _type;
        switch (this.type) {
            case 1:
                this.request = "􀽇􀜓􂱘􄇋􂈖􁰃􀋖" + _request;
                break;
            case 2:
                this.request = "􀾏􁄤􂱘􄇋􂈖􁰃􀋖" + _request;
                break;
            case 3:
                this.request = "􂆡􀒆􂱘􄇋􂈖􁰃􀋖" + _request;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
