package C14_IteratorPatternǐ;

public interface IProjectIterator extends Iterable {
    public boolean hasNext();

    public IProject next();
}
