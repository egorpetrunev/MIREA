package ru.mirea.prac11;


public abstract class AbstractQueue<E> implements Queue<E>{

    protected int size;

    protected abstract void add(E e);
    protected abstract E remove();
    protected abstract E peek();

    @Override
    public void enqueue(E e) {
        assert e != null;
        size++;
        add(e);
    }

    @Override
    public E element() {
        assert (size>0);
        return peek();
    }

    @Override
    public E dequeue() {
        assert size > 0;
        size--;
        return remove();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }
}
