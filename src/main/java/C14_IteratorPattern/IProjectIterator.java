package C14_IteratorPattern;

public interface IProjectIterator extends Iterable {
    boolean hasNext();

    IProject next();
}
