package GoF.behavioral.iterator.src;

import java.util.List;

/**
 * List Iterator
 */
public class ConcreteIterator1<E> implements Iterator<E> {
    private List<E> elements;
    private int position = 0;

    public ConcreteIterator1(List<E> list) {
        this.elements = list;
    }

    @Override
    public boolean hasNext() {
        return position < elements.size();
    }

    @Override
    public E next() {
        return elements.get(position++);
    }
}
