package C19_StatePattern.second;

public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("open...");
    }

    @Override
    public void close() {
//􂢊􁗕􀗂􁬍
        super.context.setLiftState(Context.closeingState);
//􀡼􀔰􀾨􁠬􀐎CloseState􁴹􁠻􃸠
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
//do nothing;
    }

    @Override
    public void stop() {
//do nothing;
    }
}
