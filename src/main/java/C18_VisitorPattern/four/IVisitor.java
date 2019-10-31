package C18_VisitorPattern.four;

public interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}
