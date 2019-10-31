package C18_VisitorPattern.four;


import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //􁈩􂼎􁡹􃸼􄆓􄯂􃗙
        IShowVisitor showVisitor = new ShowVisitor();
//􂈛􁘏􁡹􃸼􂱘􄆓􄯂􃗙
        ITotalVisitor totalVisitor = new TotalVisitor();
        for (Employee emp : mockEmployee()) {
            emp.accept(showVisitor); //􁥹􀦫􁈩􂼎􁡹􃸼􄆓􄯂􃗙
            emp.accept(totalVisitor);//􁥹􀦫􂈛􁘏􃸼􄆓􄯂􃗙
        }
//􁈩􂼎􁡹􃸼
        showVisitor.report();
//􂈛􁘏􁡹􃸼
        totalVisitor.totalSalary();
    }

    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<Employee>();
//􀑻􂫳􁓴􀏝􄖭􀏾􀨬􁎹
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("java chengxuyuan");
        zhangSan.setName("zhangsan");
        zhangSan.setSalary(1800);
        zhangSan.setSex(C18_VisitorPattern.three.Employee.MALE);
        empList.add(zhangSan);
//􀑻􂫳􁴢􀲯􄖭􀏾􀨬􁎹
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("meigong");
        liSi.setName("lisi");
        liSi.setSalary(1900);
        liSi.setSex(C18_VisitorPattern.three.Employee.FEMALE);
        empList.add(liSi);
        Manager wangWu = new Manager();
        wangWu.setName("wangwu");
        wangWu.setPerformance("􀷎fuzhi;;;;");
        wangWu.setSalary(18750);
        wangWu.setSex(C18_VisitorPattern.three.Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
