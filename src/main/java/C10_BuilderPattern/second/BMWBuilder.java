package C10_BuilderPattern.second;

import java.util.List;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCartModel() {
        return this.bmw;
    }
}
