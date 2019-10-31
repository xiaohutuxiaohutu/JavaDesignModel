package C12_CommandPattern.newmodel;

import C12_CommandPattern.oldmodel.CodeGroup;
import C12_CommandPattern.oldmodel.PageGroup;
import C12_CommandPattern.oldmodel.RequirementGroup;

public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();

    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();
    public abstract void execute();
}
