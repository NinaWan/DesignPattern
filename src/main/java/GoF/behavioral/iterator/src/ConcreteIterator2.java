package GoF.behavioral.iterator.src;

/**
 * Array Iterator
 */
public class ConcreteIterator2<E> implements Iterator<E> {
    private E[] elements;
    private int position = 0;

    public ConcreteIterator2(E[] arr) {
        this.elements = arr;
    }

    @Override
    public boolean hasNext() {
        return position < elements.length;
    }

    @Override
    public E next() {
        return elements[position++];
    }
}
