package C15_CompositePattern.errorDemo;


import java.util.ArrayList;

public interface IBranch {
    //获取root节点信息
    public String getInfo();

    //增加树枝节点
    public void add(IBranch branch);

    //增加树叶节点
    public void add(ILeaf leaf);

    //便利
    public ArrayList getSubordinateInfo();

}
