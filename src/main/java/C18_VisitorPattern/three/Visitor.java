package C18_VisitorPattern.three;

public class Visitor implements IVisitor {
    //经理工资系数
    private final static int MANAGER_COEFFICIENT = 5;
    //员工工资系数
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工工资总和
    private int commonTotalSalary = 0;
    //经理工资总和
    private int managerTotalSalary = 0;

    @Override
    public void visit(CommonEmployee commonEmployee) {

        System.out.println(this.getCommonEmployee(commonEmployee));
        this.calCommonSlary(commonEmployee.getSalary());
    }

    private void calCommonSlary(int salary) {
        this.commonTotalSalary = this.commonTotalSalary +
                salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    @Override
    public void visit(Manager manager) {

        System.out.println(this.getManagerInfo(manager));
        this.calManageSalary(manager.getSalary());
    }

    private void calManageSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary
                * MANAGER_COEFFICIENT;
    }

    @Override
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }

    private String getBasicInfo(Employee employee) {
        String info = "NAME:" + employee.getName() + "\t";
        info = info + "sex:" + (employee.getSex() == Employee.FEMALE ? "􀽇" : "􂬋")
                + "\t";
        info = info + "salary:" + employee.getSalary() + "\t";
        return info;
    }

    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "task:" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
