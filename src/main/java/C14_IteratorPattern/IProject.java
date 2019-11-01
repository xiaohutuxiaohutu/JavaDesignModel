package C14_IteratorPattern;

/**
 * 定义一个项目接口
 */
public interface IProject {
    void add(String name, int num, int cost);

    String getProjectInfo();

    IProjectIterator iterator();
}
