package C21_MediatorPattern.commonCode;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator _mediator) {
        super(_mediator);
    }

    // self-method
    public void selfMethod1() {
        //do something
    }

    // dep-method
    public void depMethod1() {
        super.mediator.doSomething1();
    }
}
