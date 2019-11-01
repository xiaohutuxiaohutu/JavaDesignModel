package C21_MediatorPattern.commonCode;

public class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator _mediator) {
        this.mediator = _mediator;
    }
}
