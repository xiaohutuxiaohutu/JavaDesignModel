package C14_IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ProjectIterator implements IProjectIterator{

    private List<IProject> list = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(List<IProject> list) {
        this.list = list;
    }

    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= list.size() || this.list.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }
    public IProject next(){
        return this.list.get(this.currentItem++);
    }
    public void remove(){

    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
