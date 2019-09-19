package CommandPattern.oldmodel;

public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("find code group...");
    }

    @Override
    public void add() {
        System.out.println("add construct...");
    }

    @Override
    public void delete() {
        System.out.println("delte...");
    }

    @Override
    public void change() {
        System.out.println("change...");
    }

    @Override
    public void plan() {
        System.out.println("plan...");
    }
}
