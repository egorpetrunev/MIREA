package com.company;


public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Gogol", 150);
        Book b2 = new Book("Pushkin", 70);
        Book b3 = new Book("Bianky", 100);
        Book b4 = new Book("Blok");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());

        Dog d1 = new Dog("Archi", 15);
        Dog d2 = new Dog("Tyson", 7);
        Dog d3 = new Dog("Grom", 1);
        Dog d4 = new Dog("Rem");

        System.out.println(d1.toString());
        System.out.println(d2.humanAge());
        d3.setAge(200);
        System.out.println(d3.humanAge());
        System.out.println(d4.toString());

        Ball a1 = new Ball("Orange", 12);
        Ball a2 = new Ball("Red", 9);
        Ball a3 = new Ball("Blue", 1);
        Ball a4 = new Ball("Pink");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
    }
}
