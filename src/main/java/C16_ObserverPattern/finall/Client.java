package C16_ObserverPattern.finall;

import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        Observer liSi = new LiSi();

        HanFeiZi hanFeiZi = new HanFeiZi();

        hanFeiZi.addObserver(liSi);

        hanFeiZi.haveBreakfast();
    }
}
