package IteratorPatternǐ;

import java.util.List;

public interface IProjectIterator extends Iterable {
    public boolean hasNext();

    public IProject next();
}
