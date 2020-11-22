package ru.mirea.lab16.order;

import ru.mirea.lab16.Customer;
import ru.mirea.lab16.menu.MenuItem;

import java.util.Arrays;
import java.util.Comparator;

public class TableOrder implements Order{

    private int size;
    private MenuItem[] items;
    private Customer customer;

    public TableOrder(){
        items = new MenuItem[12];
        size = 0;
    }


    @Override
    public boolean add(MenuItem item) {
        if (items.length <= size)
            grow(2*size);
        items[size] = item;
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] string = new String[size];
        for (int i = 0; i < size; i++){
            string[i] = items[i].getName();
        }
        return string;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName))
                quantity++;
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item))
                quantity++;
        }
        return quantity;
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        MenuItem[] it = new MenuItem[size-1];
        int pos = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName))
                pos = i;
        }
        return copyTo(it, pos);
    }

    @Override
    public boolean remove(MenuItem item) {
        MenuItem[] it = new MenuItem[size-1];
        int pos = -1;
        for (int i = 0; i < size; i++) {
            if (item.equals(items[i]))
                pos = i;
        }
        return copyTo(it, pos);
    }

    @Override
    public boolean removeAll(String itemName) {
        for (int i = 0; i < size; i++) {
            remove(itemName);
        }
        return true;
    }

    @Override
    public boolean removeAll(MenuItem item) {
        for (int i = 0; i < size; i++) {
            remove(item);
        }
        return true;
    }

    @Override
    public MenuItem[] sortedItemsByCost() {
        MenuItem[] it = new MenuItem[size];
        System.arraycopy(this.items, 0, it, 0, size);
        Arrays.sort(it, Comparator.comparingInt(MenuItem::getCost));
        return it;
    }

    @Override
    public int costTotal() {
        int cost = 0;
        for (int i = 0; i < size; i++) {
            cost+=items[i].getCost();
        }
        return cost;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private void grow(int capacity){
        if (capacity > items.length) {
            items = Arrays.copyOf(items, capacity+1);
        }
    }

    private boolean copyTo(MenuItem[] it, int pos) {
        if(pos >= 0 ) {
            System.arraycopy(items, 0, it, 0, pos);
            System.arraycopy(items, pos+1, it, pos, size - pos - 1);
            items = it;
            size--;
            return true;
        }
        return false;
    }
}
