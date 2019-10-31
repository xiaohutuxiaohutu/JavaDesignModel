package ObserverPattern.finall;

import java.util.Observable;

public class HanFeiZi extends Observable {
    public void haveBreakfast() {
        System.out.println("start eating ");
        super.setChanged();
        super.notifyObservers("eating .....");

    }

    public void haveFun() {
        System.out.println("start fuun ");
        super.setChanged();
        this.notifyObservers("fun ...");
    }
}
