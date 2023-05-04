package GoF.behavioral.iterator.src;

public interface Aggregate<E> {
    void add(E element);

    Iterator<E> createIterator();
}
