package C18_VisitorPattern.four;

public class TotalVisitor implements ITotalVisitor {
    //􄚼􄮼􃒣􂧚􂱘􁎹􄌘􃋏􁭄􁰃5
    private final static int MANAGER_COEFFICIENT = 5;
    //􀨬􁎹􂱘􁎹􄌘􃋏􁭄􁰃2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //􁱂􄗮􀨬􁎹􂱘􁎹􄌘􁘏􀩠
    private int commonTotalSalary = 0;
    //􄚼􄮼􃒣􂧚􂱘􁎹􄌘􁘏􀩠
    private int managerTotalSalary = 0;

    public void totalSalary() {
        System.out.println("􁴀􀝀􀧌􂱘􁳜􁎹􄌘􁘏􄹱􁰃" + (this.commonTotalSalary +
                this.managerTotalSalary));
    }

    //􄆓􄯂􁱂􄗮􀨬􁎹􀋈􄅵􃅫􁎹􄌘􁘏􄹱
    public void visit(CommonEmployee commonEmployee) {
        this.commonTotalSalary = this.commonTotalSalary +
                commonEmployee.getSalary() * COMMONEMPLOYEE_COEFFICIENT;
    }

    //􄆓􄯂􄚼􄮼􃒣􂧚􀋈􄅵􃅫􁎹􄌘􁘏􄹱
    public void visit(Manager manager) {
        this.managerTotalSalary = this.managerTotalSalary + manager.getSalary()
                * MANAGER_COEFFICIENT;
    }
}
