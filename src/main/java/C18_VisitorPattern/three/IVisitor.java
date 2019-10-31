package C18_VisitorPattern.three;

//访问者
public interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

    //统计所有员工工资总和
    int getTotalSalary();
}
