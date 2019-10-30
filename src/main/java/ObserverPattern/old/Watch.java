package ObserverPattern.old;

public class Watch extends Thread {
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    //䗮䖛ᵘ䗴ߑ᭄Ӵ䗦খ᭄ˈ៥㽕ⲥ᥻ⱘᰃ䇕,䇕ᴹⲥ᥻,㽕ⲥ᥻ҔМ
    public Watch(HanFeiZi _hanFeiZi, LiSi _liSi, String _type) {
        this.hanFeiZi = _hanFeiZi;
        this.liSi = _liSi;
        this.type = _type;
    }

    @Override
    public void run() {
        while (true) {
            if (this.type.equals("breakfast")) {
                if (this.hanFeiZi.isHaveBreakfast()) {
                    this.liSi.update("eat");
                    this.hanFeiZi.setHaveBreakfast(false);
                }
            } else {//ⲥ᥻ᰃ৺೼စФ
                if (this.hanFeiZi.isHaveFun()) {
                    this.liSi.update("fun");
                    this.hanFeiZi.setHaveFun(false);
                }
            }
        }
    }
}
