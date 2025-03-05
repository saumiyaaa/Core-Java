package com.generics;

public class StackMain {

    public static void main(String[] args) {
        
        MyStack<Integer> st1 = new MyStack<>(100); // Type-safe MyStack for Integer
        MyStack<String> st2 = new MyStack<>("HELLO"); // Type-safe MyStack for String

        // No need for casting
        Integer i1 = st1.getObject();
        String i2 = st2.getObject();
        
        //st1=st2; //ERROR - Type mismatch: cannot convert from MyStack<String> to MyStack<Integer>

        System.out.println(st1);
        System.out.println(st2);
        
        System.out.println(st1.toString());

        System.out.println(i1);
        System.out.println(i2);
    }
}
