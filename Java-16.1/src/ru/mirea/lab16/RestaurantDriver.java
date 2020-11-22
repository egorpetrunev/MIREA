package ru.mirea.lab16;

import ru.mirea.lab16.GUI.MyGUI;
import ru.mirea.lab16.menu.Drink;
import ru.mirea.lab16.menu.DrinkType;
import ru.mirea.lab16.order.Order;
import ru.mirea.lab16.order.TableOrder;

import java.util.Arrays;

public class RestaurantDriver {

    public static void main(String[] args) {
        MyGUI dialog = new MyGUI();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}