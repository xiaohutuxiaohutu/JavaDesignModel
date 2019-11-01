package C21_MediatorPattern.commonCode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Mediator {
    protected ConcreteColleague1 c1;
    protected ConcreteColleague2 c2;

    //中介者模式的业务逻辑
    public abstract void doSomething1();

    public abstract void doSomething2();
}
