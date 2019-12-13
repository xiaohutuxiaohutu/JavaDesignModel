package C9_TemplateMethodPattern.third;

public class Client {
    public static void main(String[] args) {
        HummerH2Model h2Model = new HummerH2Model();
        h2Model.run();
        HummerH1Model h1Model = new HummerH1Model();
        h1Model.setAlarmFlag(true);
        h1Model.run();
    }
}
