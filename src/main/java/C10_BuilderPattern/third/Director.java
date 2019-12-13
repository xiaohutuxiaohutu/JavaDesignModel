package C10_BuilderPattern.third;

import java.util.ArrayList;
import java.util.List;

public class Director {
    private List<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        System.out.println("getABenzModel---------------");
        return this.benzBuilder.getCartModel();
    }

    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        System.out.println("getBBenzModel--------------");
        return this.benzBuilder.getCartModel();
    }

    public BMWModel getCBMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(sequence);
        System.out.println("getCBMWModel---------------");
        return this.bmwBuilder.getCartModel();
    }

    public BMWModel getDBMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(sequence);
        System.out.println("getDBMWModel-------------");
        return this.bmwBuilder.getCartModel();
    }
}
