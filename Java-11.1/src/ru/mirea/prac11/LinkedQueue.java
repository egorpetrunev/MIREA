package ru.mirea.prac11;

public class LinkedQueue<E> extends AbstractQueue<E> {

    //invariant head.item = null
    private Node<E> head;
    //invariant last.next = null
    private Node<E> last;

    public LinkedQueue () {
        head = new Node<>(null);
        last = head;
    }

    @Override
    protected void add(E e) {
        last = last.next = new Node<>(e);
    }

    @Override
    protected E remove() {
        E e = head.next.item;
        head = head.next;
        return e;
    }

    @Override
    protected E peek() {
        return head.next.item;
    }

    @Override
    public void clear() {
        super.clear();
        head = new Node<>(null);
        last = head;
    }

    static class Node<E>{
        E item;

        Node<E> next;

        Node(E item){
            this.item = item;
        }
    }
}
