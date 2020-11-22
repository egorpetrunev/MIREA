package ru.mirea.prac11;

public class Main {

    public static void main(String[] args) {
        Queue<Integer>  d = new LinkedQueue<>();
        d.enqueue(3);
        d.enqueue(null);
        System.out.println(d.dequeue()+ " "+d.size());
        System.out.println(d.dequeue()+ " "+d.size());
    }

}
