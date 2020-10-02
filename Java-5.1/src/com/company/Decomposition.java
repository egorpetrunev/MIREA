package com.company;

public class Decomposition {
    public void dec(int x, int y){
        if (y > x / 2){
            System.out.print(x+" ");
            return;
        }
        if (x % y == 0){
            System.out.print(y+" ");
            dec(x/y, y);
        }
        else {
            dec(x, ++y);
        }
    }
}
