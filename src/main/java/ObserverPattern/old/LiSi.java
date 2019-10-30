package ObserverPattern.old;

public class LiSi implements ILiSi {
    //佪ܜᴢᮃᰃϾ㾖ᆳ㗙ˈϔᮺ䶽䴲ᄤ᳝⌏ࡼˈҪህⶹ䘧ˈҪህ㽕৥㗕ᵓ∛᡹
    public void update(String str) {
        System.out.println("start to qinshihuang");
        this.reportToQiShiHuang(str);
        System.out.println("end to qinshihuang\n");
    }

    //∛᡹㒭⾺ྟⱛ
    private void reportToQiShiHuang(String reportContext) {
        System.out.println("reprot to qinshihuang" + reportContext);
    }
}
