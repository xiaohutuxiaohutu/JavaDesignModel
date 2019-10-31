package VisitorPattern_18.three;

import lombok.Data;

@Data
public abstract class Employee {
    public final static int MALE = 0; //0􀒷􃸼􁰃􂬋􁗻
    public final static int FEMALE = 1; //1􀒷􃸼􁰃􀽇􁗻
    //􂬁􃅵􁰃􄇕􀋈􄛑􁳝􁎹􄌘
    private String name;
    //􀦾􃽕􁰃􀨬􁎹􄙷􁈅􁳝􃭾􂈈
    private int salary;
    //􁗻􀟿􁕜􄞡􃽕
    private int sex;

    public abstract void accept(IVisitor visitor);
}
