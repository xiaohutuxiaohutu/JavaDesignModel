package C6_AbstractFactoryPattern.init;

public enum HumanEnum {
    YellowMaleHuman("C6_AbstractFactoryPattern.init.YellowMaleHuman"),
    YellowFemaleMaleHuman("C6_AbstractFactoryPattern.init.YellowFemalHuman"),
    WhiteFemaleHuman("C6_AbstractFactoryPattern.init.WhiteFemalHuman"),
    WhiteMaleHuman("C6_AbstractFactoryPattern.init.WhiteMaleHuman"),
    BlackFemaleHuman("C6_AbstractFactoryPattern.init.BlackFemalHuman"),
    BlackMaleHuman("C6_AbstractFactoryPattern.init.BlackMaleHuman");


    private String value = "";

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
