package com.company;

public class AandB {
    public int aandb(int a, int b) {
        int value = 0;
        if (a > b + 1) {
            return 0;
        }
        // Базовый случай
        if (a == 0 || b == 0) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return aandb(a, b - 1) + aandb(a - 1, b - 1);
    }
}
