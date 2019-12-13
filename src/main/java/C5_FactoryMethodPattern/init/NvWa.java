package C5_FactoryMethodPattern.init;

public class NvWa {
    public static void main(String[] args) {
        System.out.println("white");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();
        System.out.println("yelloe");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();
    }
}
