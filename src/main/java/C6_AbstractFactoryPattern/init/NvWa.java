package C6_AbstractFactoryPattern.init;

public class NvWa {
    public static void main(String[] args) {
        MaleHumanFactory maleHumanFactory = new MaleHumanFactory();
        FemaleHumanFactory femaleHumanFactory = new FemaleHumanFactory();
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman1 = femaleHumanFactory.createYellowHuman();
        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        femaleYellowHuman1.sex();
    }
}
