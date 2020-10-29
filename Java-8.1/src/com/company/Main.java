package com.company;

public class Main {

    public static void main(String[] args) {

        WaitList<Integer> vec = new WaitList<>();
        vec.add(1); vec.add(2); vec.add(3); vec.add(4); vec.add(5);
        WaitList<Integer> vec2 = new WaitList<>(vec);
        BoundedWaitList<Integer> vec3 = new BoundedWaitList<>(5);
        vec3.add(5); vec3.add(6); vec3.add(7); vec3.add(8); vec3.add(9); vec3.add(10);
        System.out.println(vec3.toString());
        System.out.println(vec3.toString());
        UnfairWaitList<Integer> vec4 = new UnfairWaitList<>();
        vec4.add(1); vec4.add(2); vec4.add(3); vec4.add(4); vec4.add(5);
        System.out.println(vec4.toString());
        vec4.moveToBack(3);
        System.out.println(vec4.toString());
    }
}
