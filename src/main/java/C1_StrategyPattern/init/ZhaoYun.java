package C1_StrategyPattern.init;

public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("open one");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("///////////");
        System.out.println("open 2");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\\\\\\\\\\\\\\\\");
        System.out.println("open 3");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("///////");
    }
}
