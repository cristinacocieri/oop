package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Box box1 = new Box();

        System.out.println(box1.depth);
        System.out.println(box1.height);
        System.out.println(box1.width);


        Box box2 = new Box(24);
        System.out.println(box2.depth);
        System.out.println(box2.height);
        System.out.println(box2.width);


        Box box3 = new Box(23, 56, 87);
        System.out.println(box3.depth);
        System.out.println(box3.height);
        System.out.println(box3.width);

        System.out.println(Box.GetSurfaceAreaofBox(box3));
        System.out.println(Box.GetVolumeofBox(box3));



        Queue queue1 = new Queue(10);
        Queue queue2 = new Queue();


    }
}
