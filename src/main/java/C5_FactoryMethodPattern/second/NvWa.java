package C5_FactoryMethodPattern.second;

import C5_FactoryMethodPattern.init.Human;
import C5_FactoryMethodPattern.init.WhiteHuman;
import C5_FactoryMethodPattern.init.YellowHuman;

public class NvWa {
    public static void main(String[] args) {
        System.out.println("first create white");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        System.out.println("second create back");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();

        System.out.println("random create human");
        for (int i = 0; i < 10; i++) {
            Human human = HumanFactory.CreateHuman();
            human.cry();
            human.laugh();
            human.talk();
        }
    }
}
