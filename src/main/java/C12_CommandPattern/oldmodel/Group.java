package C12_CommandPattern.oldmodel;

/**
 * 命令接受者角色（Receive)
 */
public abstract class Group {
    public abstract void find();

    public abstract void add();

    public abstract void delete();

    public abstract void change();

    public abstract void plan();
}
