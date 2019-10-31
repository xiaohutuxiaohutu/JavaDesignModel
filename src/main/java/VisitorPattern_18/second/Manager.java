package VisitorPattern_18.second;

import lombok.Data;

@Data
public class Manager extends Employee {
    private String performance;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
