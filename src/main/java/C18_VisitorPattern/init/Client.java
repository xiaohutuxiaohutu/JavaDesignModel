package C18_VisitorPattern.init;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        for (Employee emp : mockEmployee()) {
            emp.report();
        }
    }

    private static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<Employee>();
//􀑻􂫳􁓴􀏝􄖭􀏾􀨬􁎹
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("java chengxuyuan");
        zhangSan.setName("zhangsan");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
//􀑻􂫳􁴢􀲯􄖭􀏾􀨬􁎹
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("meigong");
        liSi.setName("lisi");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
        Manager wangWu = new Manager();
        wangWu.setName("wangwu");
        wangWu.setPerformance("􀷎fuzhi;;;;");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
