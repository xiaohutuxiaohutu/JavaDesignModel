package C11_BridgePattern.init;

public abstract class Corp {
    protected abstract void produce();

    protected abstract void shell();

    public void makeMoney() {
        this.produce();
        this.shell();
    }
}
