package DecoratorPattern;

public class Father {
    public static void main(String[] args) {
       /* SchoolReport sr = new FouthGradeSchoolReport();
        sr.report();

        System.out.println("beautify-----------");
        SchoolReport sc1 = new SugarFouthGradeSchoolReport();
        sc1.report();
        sc1.sign("name");*/

        System.out.println("---final-----");
        SchoolReport schoolReport;
        schoolReport = new FouthGradeSchoolReport();
        schoolReport.report();
        System.out.println("-------HighScore---------");
        schoolReport = new HighScoreDecorator(schoolReport);
        schoolReport.report();
        System.out.println("--------sortdecorator---------");
        schoolReport = new SortDecorator(schoolReport);
        System.out.println("----------report-----");

        schoolReport.report();
        schoolReport.sign("sign name");
    }
}
