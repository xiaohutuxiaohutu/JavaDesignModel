package C19_StatePattern.second;

public class RunningState extends LiftState {
    //􂬉􁺃􄮼􀝇􄯁􀋛􄖭􁰃􃚃􁅮􀑚
    @Override
    public void close() {
//do nothing
    }

    //􄖤􃸠􂱘􁯊􀗭􁓔􂬉􁺃􄮼􀋛􀔴􂮃􀑚􀊽􂬉􁺃􀏡􀓮􃒭􀔴􁓔􂱘
    @Override
    public void open() {
//do nothing
    }

    public void run() {
        System.out.println("run...");
    }

    //􄖭􀏾􀑟􃒱􁇍􁰃􀧜􂧚􂱘􀋈􀜝􄖤􃸠􀏡􀘰􂄶􄖬􁳝􄇕􁬶􀘮􄖭􀏾􂬉􁺃􀋛􀊽􀔄􄅵􀦾􁳝􀏞􁏱􀑚
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState); //􂦃􀹗􄆒􃕂􀐎􀘰􂄶􂢊􁗕􀋗
        super.context.getLiftState().stop();
    }
}
