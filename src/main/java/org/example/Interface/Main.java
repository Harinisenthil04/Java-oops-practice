package org.example.Interface;


public class Main {
    public static void main(String[] args) {
        Sport s=new Swim();
        s.swim();
        System.out.println(s.length);
    }
}

interface Sport{
    void swim();
    int length=9;
    default void run(){
        System.out.println("I can run");
    }
}

class Swim implements Sport {
    int length=10;
    @Override
    public void swim() {
        System.out.println("I can swim faster.");
    }
}
