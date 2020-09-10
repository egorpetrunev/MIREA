package com.company;

import java.lang.*;

public class Ball {
    private String color;
    private int size;

    public Ball(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public Ball(String color) {
        this.color = color;
        this.size = -1;
    }

    public void setName(String color) {
        this.color = color;
    }

    public void setAge(int size) {
        this.size = size;
    }

    public String getName() {
        return this.color;
    }

    public int getAge() {
        return this.size;
    }

    public String toString() {
        return String.format("color: %s | size: %d", this.color, this.size);
    }

}
