package C22_InterpreterPattern.common;

import org.jaxen.Context;

public abstract class Expression {
    //每个表达式必须有一个解析任务
    public abstract Object interpreter(Context ctx);
}
