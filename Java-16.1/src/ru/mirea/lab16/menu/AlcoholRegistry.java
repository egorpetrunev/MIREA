package ru.mirea.lab16.menu;

import java.util.HashMap;
import java.util.Map;


class AlcoholRegistry {

    private static volatile AlcoholRegistry instance;
    private static volatile Map <DrinkType, Boolean> alcoholMap = initMap();
    private AlcoholRegistry(){}

    public static AlcoholRegistry getInstance() {
        if (instance == null){
            synchronized (AlcoholRegistry.class){
                instance = new AlcoholRegistry();
            }
        }
        return instance;
    }

    private static Map<DrinkType, Boolean> initMap(){
        HashMap<DrinkType, Boolean> alc = new HashMap<>();
        alc.put(DrinkType.BEER, true);
        alc.put(DrinkType.WINE, true);
        alc.put(DrinkType.VODKA, true);
        alc.put(DrinkType.BRANDY, true);
        alc.put(DrinkType.CHAMPAGNE, true);
        alc.put(DrinkType.WHISKEY, true);
        alc.put(DrinkType.TEQUILA, true);
        alc.put(DrinkType.RUM, true);
        alc.put(DrinkType.VERMUTH, true);
        alc.put(DrinkType.LIQUOR, true);
        alc.put(DrinkType.JAGERMEISTER, true);
        return alc;
    }

    boolean check(DrinkType type){
        return alcoholMap.getOrDefault(type, false);
    }
}