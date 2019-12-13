package C10_BuilderPattern.second;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("engine");
        list.add("start");
        list.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(list);
        BenzModel benzModel = (BenzModel) benzBuilder.getCartModel();
        benzModel.run();
    }
}
