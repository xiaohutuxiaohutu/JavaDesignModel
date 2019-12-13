package C10_BuilderPattern.init;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        BenzModel benzModel = new BenzModel();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("engine");
        strings.add("start");
        strings.add("stop");
        benzModel.setSequence(strings);
        benzModel.run();
    }
}
