package com.company;

import java.util.Scanner;



public class Main {
    public static void sort1(Student[] arr)
    {
        int n=arr.length;
        int counter=0;
        for(int i=1;i<n;i++)
        {
            for(int j=i; j>0 && arr[j-1].compare(arr[j])==">";j--)
            {
                counter++;
                Student tmp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=tmp;

            }
        }
    }

    public static void quicksort(Student[] mas, int first, int last)
    {
        int f = first, l = last;
        Student mid = mas[(f + l) / 2];
        int count;
        do
        {
            while (mas[f].compare(mid)==">")
                f++;
            while (mas[l].compare(mid)=="<")
                l--;
            if (f <= l)
            {
                Student buf = mas[l];
                mas[l--]=mas[f];
                mas[f++]=buf;
            }
        } while (f < l);

        if (first < l) quicksort(mas, first, l);
        if (f < last) quicksort(mas, f, last);

    }

    public static void Merge(Student[] A, int first, int last) //слияние 2-х отсортированных массивов
    {
        int middle, start, fin, j;
        Student[] mas = new Student[last-first+1];
        middle = (first + last) / 2; //вычисление среднего элемента
        start = first; //начало левой части
        fin = middle + 1; //начало правой части
        for (j = first; j <= last; j++) //выполнять от начала до конца
            if ((start <= middle) && ((fin > last) || (A[start].compare(A[fin])==">"))) {
                mas[j-first] = A[start];
                start++;
            } else {
                mas[j-first] = A[fin];
                fin++;
            }
        for (j=first;j<=last;++j) {
            A[j]=mas[j-first];
        }
    }
    
    public static void MergeSort(Student[] A, int first, int last)
    {
        {
            if (first < last)
            {
                MergeSort(A, first, (first + last) / 2); //сортировка левой части
                MergeSort(A, (first + last) / 2 + 1, last); //сортировка правой части
                Merge(A, first, last); //слияние двух частей
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите количество студентов: ");
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        Student[] arr = new Student[n];
        for (int i=0; i<n; ++i)
        {
            System.out.print("Введите информацию о студенте №"+(i+1)+":\n");
            arr[i] = new Student();
        }
        //quicksort(arr,0,arr.length-1);
        //sort1(arr);
        MergeSort(arr,0,arr.length-1);
        for (int i=0; i<n; ++i)
            System.out.println(arr[i].getName());
    }
}
