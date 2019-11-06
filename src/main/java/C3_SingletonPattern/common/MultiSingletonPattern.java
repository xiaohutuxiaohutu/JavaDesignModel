package C3_SingletonPattern.common;

/**
 * 多线程---保证每个线程使用的都是同一个对象实例
 */
public class MultiSingletonPattern {
    private static final MultiSingletonPattern singletonPattern = new
            MultiSingletonPattern();

    private MultiSingletonPattern() {
    }

    public synchronized static MultiSingletonPattern getInstance() {
        return singletonPattern;
    }
}
