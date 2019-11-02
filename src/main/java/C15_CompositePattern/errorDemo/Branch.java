package C15_CompositePattern.errorDemo;

import java.util.ArrayList;

public class Branch implements IBranch {
    private ArrayList subordinateList = new ArrayList();

    private String name = "";
    private String position = "";
    private int salary = 0;

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    //
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    //
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    //
    public String getInfo() {
        String info = "";
        info = "ৡ⿄˖" + this.name;
        info = info + "\t㘠ԡ˖" + this.position;
        info = info + "\t㭾∈˖" + this.salary;
        return info;
    }

    //
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }
}
