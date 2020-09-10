package com.company;


public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Lermontov", 150);
        Book b2 = new Book("Pushkin", 70);
        Book b3 = new Book("Brodsky", 100);
        Book b4 = new Book("Gogol");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());

        Dog d1 = new Dog("Bobik", 15);
        Dog d2 = new Dog("Mike", 7);
        Dog d3 = new Dog("Tyzik", 1);
        Dog d4 = new Dog("Sam");

        System.out.println(d1.toString());
        System.out.println(d2.humanAge());
        d3.setAge(200);
        System.out.println(d3.humanAge());
        System.out.println(d4.toString());

        Ball a1 = new Ball("Green", 12);
        Ball a2 = new Ball("Red", 9);
        Ball a3 = new Ball("Blue", 1);
        Ball a4 = new Ball("White");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
    }
}
