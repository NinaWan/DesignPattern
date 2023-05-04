package GoF.behavioral.iterator.src;

import java.lang.reflect.Array;

/**
 * Array Aggregate
 */
public class ConcreteAggregate2<E> implements Aggregate<E> {
    private E[] elements;
    private int position = 0;

    public ConcreteAggregate2(Class<E> type, int size) {
        elements = (E[]) Array.newInstance(type, size);
    }

    @Override
    public void add(E element) {
        if (position >= elements.length) {
            throw new IndexOutOfBoundsException("Aggregate is full!");
        } else {
            elements[position++] = element;
        }
    }

    @Override
    public Iterator<E> createIterator() {
        return new ConcreteIterator2<>(elements);
    }
}
