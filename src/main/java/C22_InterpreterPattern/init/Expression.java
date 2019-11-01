package C22_InterpreterPattern.init;

import java.util.HashMap;

public abstract class Expression {
    //解析公式和数值，其中var的key是公式中的参数，value是具体的数字
    public abstract int interpreter(HashMap<String, Integer> var);
}
