package C12_CommandPattern.oldmodel;

import C12_CommandPattern.newmodel.AddRequirementCommand;
import C12_CommandPattern.newmodel.Command;
import C12_CommandPattern.newmodel.DeletePageCommand;
import C12_CommandPattern.newmodel.Invoker;

public class Client {


    public static void main(String[] args) {
        System.out.println("client ask add one request...");
        RequirementGroup requirementGroup = new RequirementGroup();
        requirementGroup.find();
        requirementGroup.add();
        requirementGroup.plan();
        System.out.println("client ask delete one page");
        PageGroup pageGroup = new PageGroup();
        pageGroup.find();
        pageGroup.delete();
        pageGroup.plan();

        System.out.println("--------修改后---------");
        Invoker invoker = new Invoker();
        System.out.println("client ask add one require");
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
        System.out.println("clien ask delete one page");
        Command deletePageCommand = new DeletePageCommand();
        invoker.setCommand(deletePageCommand);
        invoker.action();


    }
}
