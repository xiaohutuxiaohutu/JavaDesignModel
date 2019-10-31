package C18_VisitorPattern.second;

public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
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
