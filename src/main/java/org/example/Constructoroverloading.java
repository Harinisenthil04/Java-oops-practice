package org.example;

public class Constructoroverloading {
    public static void main(String[] args) {
        Sample s=new Sample(6,8);
        //System.out.println(s.l);
        s.method1();
    }
}
class Sample{
    int l=90;
    int w;
    int h;

    void method1(){
        System.out.println("Hi");
    }
    Sample (){
        System.out.println("Hi everyone");
    }

    Sample (int l,int w){
        //this.l=l;
        this.w=w;
    }

    Sample (int l){
        this.l=l;
    }
}
