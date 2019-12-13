package C6_AbstractFactoryPattern.init;

public class FemaleHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleMaleHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
}
