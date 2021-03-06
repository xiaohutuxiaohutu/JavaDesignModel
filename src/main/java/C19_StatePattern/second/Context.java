package C19_StatePattern.second;

import lombok.Getter;

public class Context {
    //􁅮􀐝􀟎􁠔􁳝􂱘􂬉􁺃􂢊􁗕
    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closeingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();
    //􁅮􀏔􀏾􁔧􀠡􂬉􁺃􂢊􁗕
    @Getter
    private LiftState liftState;

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
//􁡞􁔧􀠡􂱘􂦃􀹗􄗮􂶹􀠄􀧘􀏾􁅲􂦄􃉏􀐁
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
