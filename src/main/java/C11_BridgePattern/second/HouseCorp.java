package C11_BridgePattern.second;


public class HouseCorp extends Corp {
    public HouseCorp(House house) {
        super(house);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("make money");
    }
}
