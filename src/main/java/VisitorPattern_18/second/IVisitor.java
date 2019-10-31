package VisitorPattern_18.second;

//访问者
public interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}
