package ru.mirea.lab16.menu;

public final class Drink extends MenuItem implements Alcoholable{

    private final double alcoholVal;
    private final DrinkType type;

    public Drink(int cost, String name, String description, double alcoholVal, DrinkType type) {
        super(cost, name, description);
        this.alcoholVal = alcoholVal;
        this.type = type;
    }

    public Drink(String name, String description, double alcoholVal, DrinkType type) {
        super(name, description);
        this.alcoholVal = alcoholVal;
        this.type = type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return AlcoholRegistry.getInstance().check(type);
    }

    @Override
    public double getAlcoholValue() {
        return alcoholVal;
    }
}
