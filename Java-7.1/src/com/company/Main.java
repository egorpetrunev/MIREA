package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void playGame() {
        int bufi;
        int xod = 0;
        int chet = 0, buf1 = 0, buf2 = 0;
        Scanner in = new Scanner(System.in);
        String a = new String();
        boolean first_choose = true;
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> buf = new Stack<>();
        while (true) {
            chet = 0;
            for (int i = 0; i < arr.length; ++i) {
                if (arr[i] == -1)
                    chet++;

            }
            if (chet == 10)
                break;
            System.out.println("Доступные для выбора карты:");

            for (int i = 0; i < arr.length; ++i)
                if (arr[i] != -1)
                    System.out.print(arr[i] + " ");

            if (first_choose) {
                System.out.print("\nПервый игрок выберите карту:");
                bufi = in.nextInt();
                stack1.push(bufi);
                arr[bufi] = -1;
                first_choose = false;
            } else {
                System.out.print("\nВторой игрок выберите карту:");
                bufi = in.nextInt();
                stack2.push(bufi);
                arr[bufi] = -1;
                first_choose = true;
            }
            System.out.println("");
        }


        //------------------------------------------------//

        while (true)
        {
            chet = 0;
            System.out.println("\nВведите любой символ для совершния очередного хода");
            xod++;
            a = in.nextLine();
            buf1 = stack1.pop();
            buf2 = stack2.pop();
            if (buf2>buf1 || buf2==0 && buf1==9)
                first_choose = false;
            else
                first_choose = true;
            System.out.println("Карта первого игрока = "+String.valueOf(buf1)+"\nКарта второго игрока = "+String.valueOf(buf2));
            if (first_choose)
            {
                System.out.println("Первый игрок забирает карты!");
                chet = stack1.size();
                for (int i=0; i<chet; ++i)
                    buf.push(stack1.pop());
                buf.push(buf1);
                buf.push(buf2);
                chet+=2;
                for (int i=0; i<chet; ++i)
                   stack1.push(buf.pop());
                System.out.println("Теперь у первого "+String.valueOf(stack1.size())+" карт, а у второго - "+String.valueOf(stack2.size()));
            }
            else
            {
                System.out.println("Второй игрок забирает карты!");
                chet = stack2.size();
                for (int i=0; i<chet; ++i)
                    buf.push(stack2.pop());
                buf.push(buf1);
                buf.push(buf2);
                chet+=2;
                for (int i=0; i<chet; ++i)
                    stack2.push(buf.pop());
                System.out.println("Теперь у первого "+String.valueOf(stack1.size())+" карт, а у второго - "+String.valueOf(stack2.size()));
            }
            if (stack1.size()==0) {
                System.out.println("Второй игрок победил!");
                return;
            }
            if (stack2.size()==0) {
                System.out.println("Первый игрок победил!");
                return;
            }
            if (xod==106) {
                System.out.println("botva");
                return;

            }

        }



    }
    public static void main (String[]args){
        playGame();
    }
}

