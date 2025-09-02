package org.example.Encapsulation;

public class Box {
    private int length=3;
    protected int l2=0;

    public int getLength() {
        return length;
    }
    public int setLength(){
        length=10;
        return length;
    }

    public void setl(int length){
        if(length>50){
            System.out.println("this is length greater than 50");
        }
        else{
            length+=1;
            System.out.println(length);
        }

    }
}
