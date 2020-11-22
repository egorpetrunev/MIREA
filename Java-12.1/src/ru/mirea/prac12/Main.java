package ru.mirea.prac12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberConverter numberConverter = new NumberConverter(new Scanner(System.in).next());
        System.out.println(numberConverter.convert());
    }
}
