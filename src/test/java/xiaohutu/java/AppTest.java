package xiaohutu.java;

import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void HashMapdemo() {
//        Collection values = map.values();
        Collection collection = new ConcurrentLinkedQueue();
        collection.add("1");
        collection.add(1);
        collection.add(2);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next.getClass().getName() + ":" + next.toString());
            System.out.println(next.toString());
        }
    }
}
