package ru.mirea.prac11;

import java.util.Arrays;

public class ArrayQueue<E> extends AbstractQueue<E> {

    private int head;

    private Object[] elements;

    public ArrayQueue(){
        elements = new Object[16];
        head = 0;
    }

    public ArrayQueue(int size){
        elements = new Object[size];
    }

    @Override
    protected void add(E e) {
        if (elements.length == size){
            grow(2*size);
        }
        elements[size-1] = e;
    }

    @Override
    @SuppressWarnings("unchecked")
    protected  E remove() {
        head++;
        return (E)elements[head-1];
    }

    @Override
    @SuppressWarnings("unchecked")
    protected E peek() {
        return (E)elements[head];
    }

    @Override
    public void clear() {
        super.clear();
        elements = new Object[16];
    }

    void grow(int capacity){
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, capacity);
        }
    }
}
