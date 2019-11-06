package C2_ProxyPattern.init;

public class WangPo implements KindWomen {
    private KindWomen kindWomen;

    public WangPo() {
        this.kindWomen = new PanJinLian();
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
