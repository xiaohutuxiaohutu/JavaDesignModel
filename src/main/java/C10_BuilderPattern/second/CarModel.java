package C10_BuilderPattern.second;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
    private List<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected boolean isAlarm() {
        return true;
    }

    public final void run() {
        for (String s : sequence) {
            if (s.equalsIgnoreCase("start")) {

                this.start();
            } else if (s.equalsIgnoreCase("stop")) {

                this.stop();
            } else if (s.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (s.equalsIgnoreCase("engine")) {
                this.engineBoom();
            }
        }
    }

    final public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
