package C22_InterpreterPattern.init;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;
}
