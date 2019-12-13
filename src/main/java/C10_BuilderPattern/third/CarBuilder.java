package C10_BuilderPattern.third;

import java.util.List;

public abstract class CarBuilder {
    public abstract void setSequence(List<String> sequence);

    public abstract CarModel getCartModel();
}
