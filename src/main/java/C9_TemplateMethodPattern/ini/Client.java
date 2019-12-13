package C9_TemplateMethodPattern.ini;

public class Client {
    public static void main(String[] args) {
        HummerH1Model h1Model = new HummerH1Model();
        HummerH2Model h2Model = new HummerH2Model();
        h1Model.run();
        h2Model.run();
    }
}
