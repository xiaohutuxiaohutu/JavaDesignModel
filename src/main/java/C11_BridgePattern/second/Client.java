package C11_BridgePattern.second;

public class Client {
    public static void main(String[] args) {
        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        System.out.println();
        ShanzaiCorp shanzaiCorp = new ShanzaiCorp(new Clothes());
        shanzaiCorp.makeMoney();
        System.out.println();
        ShanzaiCorp shanzaiCorp1 = new ShanzaiCorp(new Ipod());
        shanzaiCorp1.makeMoney();
    }
}
