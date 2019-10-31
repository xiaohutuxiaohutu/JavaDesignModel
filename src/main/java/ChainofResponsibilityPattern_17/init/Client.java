package ChainofResponsibilityPattern_17.init;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "guangjie"));
        }
        IHandler father = new Father();
        IHandler husband = new Husband();
        for (IWomen women : arrayList) {
            if (women.getType() == 1) { //􁳾􃒧􁀮􁇥􀽇􀋈􄇋􂼎􂠊􀒆
                System.out.println("\n--------dortor ask father-------");
                father.HandleMessage(women);
            } else if (women.getType() == 2) { //􁏆􁀮􁇥􀽛􀋈􄇋􂼎􀏜􀻿
                System.out.println("\n--------wife ask husban-------");
                husband.HandleMessage(women);
            }
        }
    }
}
