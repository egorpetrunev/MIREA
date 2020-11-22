package ru.mirea.lab16.order;

import ru.mirea.lab16.Customer;
import ru.mirea.lab16.menu.MenuItem;

public interface Order {
    boolean add(MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem item);
    MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    boolean removeAll(String itemName);
    boolean removeAll(MenuItem item);
    MenuItem[] sortedItemsByCost();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
}
