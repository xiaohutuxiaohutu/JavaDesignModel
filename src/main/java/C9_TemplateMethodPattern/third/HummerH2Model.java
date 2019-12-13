package C9_TemplateMethodPattern.third;

public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("h2 start");
    }

    @Override
    protected void stop() {
        System.out.println("h2 stop");
    }

    @Override
    protected void alarm() {
        System.out.println("h2 alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("h2 engine boom");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
