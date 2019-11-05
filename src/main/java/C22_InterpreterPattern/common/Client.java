package C22_InterpreterPattern.common;

import org.jaxen.Context;
import org.jaxen.ContextSupport;

import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Context ctx = new Context(new ContextSupport());
        //定义一个语法容器，容纳一个具体的表达式，通常是ListArray,LinkedList,Stack􃄝􃉏
        Stack<Expression> stack = null;
        for (; ; ) {
//进行语法判断，并产生递归调用
        }
        //产生一个完整地语法树，由各个具体的语法分析进行解析
        Expression exp = stack.pop();
//具体元素进入场景
        exp.interpreter(ctx);
    }
}
