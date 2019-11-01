package C21_MediatorPattern.commonCode;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator _mediator) {
        super(_mediator);
    }

    public void selfMethod2() {
        // do something;
    }

    //􀕱􄌪􁮍􂊩 dep-method
    public void depMethod2() {
//处理自己的业务逻辑；
//自己不能处理的，委托给中介者处理
        super.mediator.doSomething2();
    }
}
