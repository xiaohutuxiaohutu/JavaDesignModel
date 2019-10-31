package ObserverPattern.modify;

import ObserverPattern.old.ILiSi;

public class LiSi implements ILiSi {
    public void update(String str) {
        System.out.println("start to qinshihuang");
        this.reportToQiShiHuang(str);
        System.out.println("end to qinshihuang\n");
    }

    private void reportToQiShiHuang(String reportContext) {
        System.out.println("reprot to qinshihuang" + reportContext);
    }
}
