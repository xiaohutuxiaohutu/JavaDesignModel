package C17_ChainofResponsibilityPattern.init;

import lombok.Data;

@Data
public class Women implements IWomen {
    private int type = 0;
    private String request = "";

    public Women(int _type, String _request) {
        this.type = _type;
        this.request = _request;
    }
}
