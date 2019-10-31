package C16_ObserverPattern.finall;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("start report ...");
        this.reportToQiShiHuang(arg.toString());
        System.out.println("end report...\n");
    }

    private void reportToQiShiHuang(String reportContext) {
        System.out.println("report --->" + reportContext);
    }
}
