package org.example.Encapsulation;

//Encapsulation:
//  -> Wrapping up of the data members and methods in a class.It is basically to protect your data where we
//bind together the details inside a class.Here,the goal is to hide the data ,to restrict the data being accessed
//and modified.

//Abstarction:
//    ->Hiding unnecessary details and sharing only valuable information.The main goal is not to hide the data
//details,just to make it simple showing only what is needed.
public class Main {
    public static void main(String[] args) {
        Box b=new Box();
        System.out.println(b.getLength());
        System.out.println(b.setLength());
        System.out.println(b.getLength());

        b.setl(24);
        System.out.println(b.getLength());
    }

}
