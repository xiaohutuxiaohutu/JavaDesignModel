package C9_TemplateMethodPattern.second;

public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("h1 start");
    }

    @Override
    public void stop() {
        System.out.println("h1 stop");
    }

    @Override
    public void alarm() {
        System.out.println("h1 alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("h1 engine boom");
    }

}
