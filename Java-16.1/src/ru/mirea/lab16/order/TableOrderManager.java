package ru.mirea.lab16.order;

import ru.mirea.lab16.menu.MenuItem;

public class TableOrderManager implements OrderManager {

    private final Order[] orders;

    public TableOrderManager(int tables){
        orders = new Order[tables];
    }

    @Override
    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (Order order: orders) {
            quantity += order.itemQuantity(itemName);
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        for (Order order: orders) {
            quantity += order.itemQuantity(item);
        }
        return quantity;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for (Order order: orders) {
            cost += order.costTotal();
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return orders.length;
    }

    public void add(Order order, int tableNumber){
        if (tableNumber <= orders.length)
            orders[tableNumber -1] = order;
    }

    public void addItem(MenuItem item, int tableNumber){
        if (tableNumber <= orders.length)
            orders[tableNumber - 1].add(item);
    }

    public Order getOrder(int table){
        return orders[table-1];
    }

    public void remove(Order order){
        for (int i = 0; i < orders.length; i++){
            if (orders[i].equals(order)) {
                orders[i] = null;
                return;
            }
        }
    }

    public void remove(int table){
        orders[table-1] = null;
    }

    public void removeAll(Order order){
        for (int i = 0; i < orders.length; i++){
            if (orders[i].equals(order))
                orders[i] = null;
        }
    }
}
