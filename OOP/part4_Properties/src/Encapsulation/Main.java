package Encapsulation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A obj = new A(2,"Michael");

        // have to do few things with the data members
        // 1- access the data members.
        // 2- modify the data members.

//        System.out.println(obj.getNum());
//    obj.setNum(34);
//        System.out.println(obj.getNum());
//
//        System.out.println();
//
//        System.out.println(obj.getName());
//        obj.setName("Oggy");
//        System.out.println(obj.getName());


        System.out.println(obj.getNum());
        obj.setNum(45);
        System.out.println(obj.getNum());


    }
}
