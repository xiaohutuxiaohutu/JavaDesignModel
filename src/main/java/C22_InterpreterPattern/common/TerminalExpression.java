package C22_InterpreterPattern.common;


import org.jaxen.Context;

public class TerminalExpression extends Expression {
    //通常终结表达式只有一个，但是有多个对象
    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}
