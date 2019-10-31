package C18_VisitorPattern.init;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Employee {
    public final static int MALE = 0;
    public final static int FEMALE = 1;
    private String name;
    private int salary;
    private int sex;

    public final void report() {
        String info = "name: " + this.name + "\t";
        info = info + "set:" + (this.sex == FEMALE ? "women" : "men") + "\t";
        info = info + "salary:" + this.salary + "\t";
        info = info + this.getOtherInfo();
        System.out.println(info);
    }

    //拼装员工信息
    protected abstract String getOtherInfo();
}
