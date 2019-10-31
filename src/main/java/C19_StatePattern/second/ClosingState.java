package C19_StatePattern.second;

public class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState); //􃕂􀐎􄮼􁬲􂢊􁗕
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("close...");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState); //􄆒􃕂􀐎􄖤􃸠􂢊􁗕􀋗
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState); //􄆒􃕂􀐎􀘰􂄶􂢊􁗕􀋗
        super.context.getLiftState().stop();
    }
}
