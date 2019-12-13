package C9_TemplateMethodPattern.ini;

public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("h2 start");
    }

    @Override
    public void stop() {
        System.out.println("h2 stop");
    }

    @Override
    public void alarm() {
        System.out.println("h2 alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("h2 engine boom");
    }
}
