package C14_IteratorPatternǐ;

/**
 * 定义一个项目接口
 */
public interface IProject {
    public void add(String name,int num,int cost);
    public String getProjectInfo();
    public IProjectIterator iterator();
}
