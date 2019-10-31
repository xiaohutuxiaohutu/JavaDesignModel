package VisitorPattern_18.four;

public interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}
