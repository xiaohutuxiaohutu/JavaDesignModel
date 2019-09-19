package DecoratorPattern;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    private void reportHighScore(){
        System.out.println("这次考试语文最高75");
    }

    private void reportSort(){
        System.out.println("range 38");
    }
    public void report(){
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
