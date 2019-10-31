package C13_DecoratorPattern;

public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        //
        System.out.println("xxx家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 题曰 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名：   ");
    }

    @Override
    public void sign(String name) {
        System.out.println(name);
    }
}
