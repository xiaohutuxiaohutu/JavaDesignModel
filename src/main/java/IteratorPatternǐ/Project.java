package IteratorPatternǐ;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.List;

public class Project implements IProject {
    private String name="";
    //项目人数
    private int num=0;
    //项目费用
    private int cost=0;
    private List<IProject> list=new ArrayList<>();

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.list.add(new Project(name,num,cost));
    }

    @Override
    public String getProjectInfo() {
//        String info="project name:"+this.name;
        StringBuffer buffer = new StringBuffer();
        buffer.append("project name:"+this.name);
        buffer.append("\tpeople num"+this.num);
        buffer.append("\tproj fee"+this.cost);
        return buffer.toString();
    }



    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator((this.list));
    }
}
