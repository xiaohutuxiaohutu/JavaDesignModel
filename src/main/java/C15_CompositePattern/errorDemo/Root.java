package C15_CompositePattern.errorDemo;

import java.util.ArrayList;

public class Root {
    //root节点下的子
    private ArrayList subordinateList = new ArrayList();
    //ḍ㡖⚍ⱘৡ⿄
    private String name = "";
    //ḍ㡖⚍ⱘ㘠ԡ
    private String position = "";
    //ḍ㡖⚍ⱘ㭾∈
    private int salary = 0;

    //构造方法
    public Root(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    //增加树枝节点
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    //增加叶子节点
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    //得到自己的信息
    public String getInfo() {
        String info = "";
        info = "INFO˖" + this.name;
        info = info + "\t㘠ԡ˖" + this.position;
        info = info + "\t㭾∈: " + this.salary;
        return info;
    }

    //得到下级信息
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }
}
