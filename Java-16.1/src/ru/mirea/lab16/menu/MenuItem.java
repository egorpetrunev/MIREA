package ru.mirea.lab16.menu;

import java.util.Objects;

public abstract class MenuItem {
    private final int cost;
    private final String name;
    private final String description;

    protected MenuItem(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    protected MenuItem(String name, String description) {
        this(0, name, description);
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return cost == menuItem.cost &&
                Objects.equals(name, menuItem.name) &&
                Objects.equals(description, menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, name, description);
    }
}
