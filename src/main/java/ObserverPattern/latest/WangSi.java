package ObserverPattern.latest;

public class WangSi implements Observer {
    @Override
    public void update(String content) {
        System.out.println("⥟ᮃ˖㾖ᆳࠄ䶽䴲ᄤ⌏ࡼˈ㞾Ꮕгᓔྟ⌏ࡼњ...");
        this.cry(content);
        System.out.println("⥟ᮃ˖ⳳⳳⱘુ⅏њ...\n");
    }

    private void cry(String context) {
        System.out.println("⥟ᮃ˖಴Ў" + context + "ˈ——᠔ҹ៥ᚆӸਔʽ");
    }
}
