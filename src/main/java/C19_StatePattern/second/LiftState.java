package C19_StatePattern.second;

import lombok.Setter;

public abstract class LiftState {
    @Setter
    protected Context context;

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
