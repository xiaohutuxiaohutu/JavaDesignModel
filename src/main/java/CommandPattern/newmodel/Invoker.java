package CommandPattern.newmodel;

/**
 * 接头人的职责就是接受命令并执行
 */

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;

    }

    public void action() {
        this.command.execute();
    }

}
