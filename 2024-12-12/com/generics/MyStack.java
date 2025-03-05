package com.generics;

public class MyStack<T> {
    
    private T obj;

    public MyStack(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return obj;
    }

    @Override
    public String toString() {
        return "Object: " + obj;
    }
}
