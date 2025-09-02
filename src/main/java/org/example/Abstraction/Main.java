package org.example.Abstraction;

public class Main {
    public static void main(String[] args) {
        Travel d= new Destiny(3);
        d.destiny();
        d.name();

        Destiny t=new Destiny(100);
        t.destiny();

    }
}
