package C13_DecoratorPattern;

public class HighScoreDecorator extends Decorator {
    //有参构造函数
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportHighScore(){
        System.out.println("high score 75");
    }
    public void report(){
        this.reportHighScore();
        super.report();
    }

}
