package C11_BridgePattern.init;

public class Client {
    public static void main(String[] args) {
        System.out.println();
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        System.out.println();
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
    }
}
