package C16_ObserverPattern.latest;

public class LiSi implements Observer {

    //
    public void update(String str) {
        System.out.println("start report");
        this.reportToQiShiHuang(str);
        System.out.println("end report \n");
    }

    //
    private void reportToQiShiHuang(String reportContext) {
        System.out.println("report:--->" + reportContext);
    }
}
