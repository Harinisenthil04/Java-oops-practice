package org.example.polymorphism;

import org.example.Encapsulation.Box;

public class Main  {
    public static void main(String[] args) {
        Shapes s=new Shapes();
        s.area();
        System.out.println(s.age);

        Circle c=new Circle();
        c.area();
        System.out.println(c.age);

        Shapes s1=new Circle();
        s1.area();
        System.out.println(s1.age);

        System.out.println(s1 instanceof Circle);


    }
}
