package com.hillel.lesson5.classwork;

public class Task1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 100;

        int x = (a < b)? 15 : 30;

        System.out.println(x);


        int mounth = 3;
        switch (mounth){
            case 1 :
                System.out.println("This is January");
                break;
            case 2 :
                System.out.println("This is February");
                break;
            case 3 :
                System.out.println("This is March");
                break;
            case 4 :
                System.out.println("This is April");
                break;
            default:
                System.out.println("Unknown month!!!");

        }
    }


}
