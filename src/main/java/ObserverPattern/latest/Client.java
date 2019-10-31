package ObserverPattern.latest;

public class Client {
    public static void main(String[] args) {
        //new 觀察者
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();

        //new
        HanFeiZi hanFeiZi = new HanFeiZi();

        //add
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);

        //
        hanFeiZi.haveBreakfast();
    }
}

