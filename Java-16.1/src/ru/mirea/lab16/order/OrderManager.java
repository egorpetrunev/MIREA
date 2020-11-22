package ru.mirea.lab16.order;

import ru.mirea.lab16.menu.MenuItem;

public interface OrderManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
