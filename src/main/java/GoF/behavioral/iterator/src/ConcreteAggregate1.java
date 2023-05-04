package GoF.behavioral.iterator.src;

import java.util.ArrayList;
import java.util.List;

/**
 * List Aggregate
 */
public class ConcreteAggregate1<E> implements Aggregate<E> {
    private List<E> elements;

    public ConcreteAggregate1() {
        elements = new ArrayList<>();
    }

    @Override
    public void add(E element) {
        elements.add(element);
    }

    @Override
    public Iterator<E> createIterator() {
        return new ConcreteIterator1<>(elements);
    }
}
