package ru.mirea.lab16.order;

import ru.mirea.lab16.menu.MenuItem;

public class InternetOrderManager implements OrderManager {

    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        Node next;
        Node prev;
        Order value;

        Node( Order value){
            this.value = value;
        }
    }

    public InternetOrderManager(){
        head = new Node(null);
        tail = head;
        size = 0;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int quantity = 0;
        if (head.value == null){
            return 0;
        }
        Node temp = head;
        for (int i = 0; i < size; i++) {
            quantity += temp.value.itemQuantity(itemName);
            temp = temp.next;
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        if (head.value == null){
            return 0;
        }
        Node temp = head;
        for (int i = 0; i < size; i++) {
            quantity += temp.value.itemQuantity(item);
            temp = temp.next;
        }
        return quantity;
    }

    @Override
    public Order[] getOrders() {
        if (head.value == null){
            return null;
        }
        Node temp = head;
        Order[] items = new Order[size];
        for (int i = 0; i < size; i++) {
            items[i] = temp.value;
            temp = temp.next;
        }
        return items;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        if (head.value == null){
            return 0;
        }
        Node temp = head;
        for (int i = 0; i < size; i++) {
            cost += temp.value.costTotal();
            temp = temp.next;
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }

    public boolean add(Order order){
        size++;
        tail = tail.next = new Node(order);
        return true;
    }

    public Order remove(){
        Order e = head.next.value;
        head = head.next;
        size--;
        return e;
    }

    public Order order(){
        return head.next.value;
    }
}
