package C3_SingletonPattern.common;

/**
 * 单线程
 */
public class SingletonPattern {
    private static SingletonPattern singletonPattern = null;

    private SingletonPattern() {

    }

    public SingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();

        }
        return singletonPattern;
    }
}
