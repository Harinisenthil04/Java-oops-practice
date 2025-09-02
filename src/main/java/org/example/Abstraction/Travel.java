package org.example.Abstraction;

abstract public class Travel {
    abstract void destiny();

    int length=60;
    public Travel(int length) {
        //this.length = length;
        System.out.println(this.length);
    }

    public void name(){
        int n=10;
        System.out.println(n);
    }
}

class Destiny extends Travel{
    public Destiny(int length) {
        super(length);
    }

    @Override
    void destiny(){
        System.out.println("This is child class.");
    }
}
