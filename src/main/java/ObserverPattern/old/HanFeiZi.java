package ObserverPattern.old;

import lombok.Data;

@Data
public class HanFeiZi implements IHanFeiZi {
    private boolean isHaveBreakfast = false;
    private boolean isHaveFun = false;

    public void haveBreakfast() {
        System.out.println("eating");
        this.isHaveBreakfast = true;
    }

    public void haveFun() {
        System.out.println("funing");
        this.isHaveFun = true;
    }

    public boolean isHaveBreakfast() {
        return isHaveBreakfast;
    }

    public void setHaveBreakfast(boolean isHaveBreakfast) {
        this.isHaveBreakfast = isHaveBreakfast;
    }

    public boolean isHaveFun() {
        return isHaveFun;
    }

    public void setHaveFun(boolean isHaveFun) {
        this.isHaveFun = isHaveFun;
    }
}
