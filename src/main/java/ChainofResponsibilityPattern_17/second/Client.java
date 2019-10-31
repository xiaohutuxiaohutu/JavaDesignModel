package ChainofResponsibilityPattern_17.second;


import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "􁟥􃽕􀟎􀦏􄗯􃸫"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        father.setNext(husband);
        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }
    }
}
