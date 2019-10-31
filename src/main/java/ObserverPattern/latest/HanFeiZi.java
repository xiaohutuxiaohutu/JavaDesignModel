package ObserverPattern.latest;

import java.util.ArrayList;

public class HanFeiZi implements Observable {
    //存放所有的观察者
    private ArrayList<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observerList) {
            observer.update(context);
        }
    }

    public void haveBreakfast() {
        System.out.println("start eating");
        //䗮ⶹ᠔᳝ⱘ㾖ᆳ㗙
        this.notifyObservers("eating");
    }

    public void haveFun() {
        System.out.println("start fun");
        this.notifyObservers("fun");
    }
}
