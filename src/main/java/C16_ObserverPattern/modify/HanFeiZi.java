package C16_ObserverPattern.modify;

import C16_ObserverPattern.old.IHanFeiZi;
import C16_ObserverPattern.old.ILiSi;
import lombok.Data;

@Data
public class HanFeiZi implements IHanFeiZi {
    private ILiSi liSi = new LiSi();

    //
    public void haveBreakfast() {
        System.out.println("start eating");
        //䗮ⶹᴢᮃ
        this.liSi.update("eating");
    }

    //䶽䴲ᄤᓔྟစФњ,সҷҎ≵ହစФˈԴ㛑ᛇࠄⱘህ䙷М໮
    public void haveFun() {
        System.out.println("start fun ");
        this.liSi.update("fun ");
    }
}
