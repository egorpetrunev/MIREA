package com.company;

public interface Helper extends Comparable<Student>{

    public default void sort1(Helper[] mas)
    {
        Student[] arr = (Student[])mas;
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            for(int j=0; j<n-1;j++)
                if (arr[j].compareTo(arr[j+1])==-1) {
                    Student tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
        }
        mas = (Helper[])arr;
    }

    public default void find(Helper[] arr, String name)
    {
        Student[] mas = (Student[])arr;
        try {
            for (int i = 0; i < mas.length; ++i)
                if (mas[i].getName().equals(name)) {
                    System.out.println("Студент с заданным именем найден!\nОн " + String.valueOf(i + 1) + " по успеваемости.");
                    return;
                }
            throw new MyException("Студента с таким именем не существует!");
        }
        catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
