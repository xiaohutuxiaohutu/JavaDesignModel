package ChainofResponsibilityPattern_17.second;

public abstract class Handler {
    private int level = 0;
    private Handler nextHanlder;

    public Handler(int _level) {
        this.level = _level;
    }

    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHanlder != null) { //􁳝􀧢􃓁􂦃􃡖􀋈􁠡􁡞􄇋􂈖􁕔􀧢􄗦􄗕
                this.nextHanlder.HandleMessage(women);
            } else { //􁏆􃒣􂉵􁳝􀧢􃓁􀻘􂧚􀒎􀑚􀋈􀏡􂫼􀻘􂧚􀑚
                System.out.println("-----------􂉵􀴄􁮍􄇋􂼎􀑚􀋈􀏡􀘮􀻘􂧚􀊽---------\n");

            }
        }
    }

    public void setNext(Handler _handler) {
        this.nextHanlder = _handler;
    }

    public abstract void response(IWomen women);

}
