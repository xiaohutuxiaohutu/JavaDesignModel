package CommandPattern.newmodel;

import CommandPattern.oldmodel.CodeGroup;
import CommandPattern.oldmodel.PageGroup;
import CommandPattern.oldmodel.RequirementGroup;

public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();

    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();
    public abstract void execute();
}
