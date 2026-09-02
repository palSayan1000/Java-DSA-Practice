package object_oriented_programming.oop_4.access;

public class A {
    private int num;
    // int num; // if u do like this it is default access specifier
    // in the different package it will not be able to allow but in the same package it will be able to allow
    // default basically means you are not able to access outside the package
    // private in the file only
    // public every where (after importing in other packages and in same package no import required)
    String name;
    int[] arr;
    protected int number;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
