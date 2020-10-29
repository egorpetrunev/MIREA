package com.company;

import java.util.Comparator;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int a;
        System.out.println("Введите количество студентов: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        Helper[] students = new Student[a];
        for (int i = 0; i<a; ++i)
            students[i] = new Student();
        students[0].sort1(students);
        System.out.println(students[0]+"\n"+students[1]+"\n"+students[2]);
        students[0].find(students, "a");
    }
}
