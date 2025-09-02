package org.example;

class Parent{
    int length=90;
    int width;
    int height;

    static void method1(){
        System.out.println("Hello ,This is static.");
    }
    public Parent(int length, int width, int height) {
        //this.length = length;
        this.width = width;
        this.height = height;
    }
}

class Child extends Parent{
    int total=90+100;
    int length=92;

    public Child(int length, int width, int height, int total, int length1) {
        super(length, width, height);
        this.total = total;
        this.length = length;

        System.out.println(super.length);
    }



}

public class Main {
    public static void main(String[] args) {
       Parent obj=new Child(2,4,5,8,6);
       System.out.println(obj.length);
        Child.method1();
        Parent.method1();

        System.out.println(obj instanceof Child);

    }
}