package C19_StatePattern.init;

public class Lift implements ILift {
    private int state;

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE: //􀽖􁵰􁏆􃒣􀳼􄮼􁬲􂢊􁗕􀋈􀟭􀒔􀐜􄛑􀏡􀘮
//do nothing;
                break;
            case CLOSING_STATE: //􀽖􁰃􂬉􁺃􁯊􀝇􄯁􂢊􁗕􀋈􀟭􀧃􀒹􁓔􀨃
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE: //􂄷􀳼􄖤􃸠􂢊􁗕􀋈􀟭􀏡􃛑􁓔􄮼􀋈􀒔􀐜􄛑􀏡􀘮
//do nothing;
                break;
            case STOPPING_STATE: //􀘰􂄶􂢊􁗕􀋈􂎵􂜊􃽕􁓔􄮼􀑚
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE: //􀽖􁵰􁰃􀟭􀧃􀒹􀝇􄮼􀋈􀧠􁯊􀗂􁬍􂬉􁺃􂢊􁗕
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE: //􀽖􁵰􂬉􁺃􁈅􁰃􀝇􄮼􂢊􁗕􀋈􀟭􀒔􀐜􄛑􀏡􀘮
//do nothing;
                break;
            case RUNNING_STATE: //􀽖􁵰􁰃􂄷􀳼􄖤􃸠􀋈􄮼􁴀􁴹􁈅􁰃􀝇􄯁􂱘􀋈􀐳􄇈􁯢􄛑􀏡􀘮
//do nothing;
                break;
            case STOPPING_STATE: //􀽖􁵰􁰃􀘰􂄶􂢊􁗕􀋈􁴀􀐳􁰃􀝇􄯁􂱘􀋈􀒔􀐜􀐳􀏡􀘮
//do nothing;
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE: //􀽖􁵰􁏆􃒣􀳼􄮼􁬲􂢊􁗕􀋈􀟭􀏡􀔴􃛑􄖤􃸠􀋈􀒔􀐜􄛑􀏡􀘮
//do nothing;
                break;
            case CLOSING_STATE: //􀽖􁰃􂬉􁺃􁯊􀝇􄯁􂢊􁗕􀋈􀟭􀧃􀒹􄖤􃸠
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE: //􂄷􀳼􄖤􃸠􂢊􁗕􀋈􀟭􀒔􀐜􄛑􀏡􀘮
//do nothing;
                break;
            case STOPPING_STATE: //􀘰􂄶􂢊􁗕􀋈􀧃􀒹􄖤􃸠
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE: //􀽖􁵰􁏆􃒣􀳼􄮼􁬲􂢊􁗕􀋈􄙷􃚃􁅮􃽕􀜜􀘰􀏟􁴹􂱘􀋈􀒔􀐜􄛑􀏡􀘮
//do nothing;
                break;
            case CLOSING_STATE: //􀽖􁰃􂬉􁺃􁯊􀝇􄯁􂢊􁗕􀋈􀟭􁔧􂜊􀧃􀒹􀘰􂄶􀑚
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case RUNNING_STATE: //􂄷􀳼􄖤􃸠􂢊􁗕􀋈􁳝􄖤􃸠􁔧􂜊􄙷􀐳􁈅􁳝􀘰􂄶􀑚
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case STOPPING_STATE: //􀘰􂄶􂢊􁗕􀋈􀒔􀐜􄛑􀏡􀘮
//do nothing;
                break;
        }

    }

    private void closeWithoutLogic() {
        System.out.println("closed...");
    }

    private void openWithoutLogic() {
        System.out.println("open...");
    }

    private void runWithoutLogic() {
        System.out.println("run...");
    }

    private void stopWithoutLogic() {
        System.out.println("stop...");
    }

}
