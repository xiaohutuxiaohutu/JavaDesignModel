package VisitorPattern_18.four;

public class ShowVisitor implements IShowVisitor {
    private String info = "";

    //print form
    public void report() {
        System.out.println(this.info);
    }

    private String getBasicInfo(Employee employee) {
        String info = "NAME:" + employee.getName() + "\t";
        info = info + "sex:" + (employee.getSex() == Employee.FEMALE ? "􀽇" : "􂬋")
                + "\t";
        info = info + "salary:" + employee.getSalary() + "\t";
        return info;
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info = this.info + this.getBasicInfo(commonEmployee) + "job:" + commonEmployee.getJob() + "\t\n";
    }

    @Override
    public void visit(Manager manager) {
        this.info = this.info + this.getBasicInfo(manager) + "job: " + manager.getPerformance() + "\t\n";
    }
}
