package com.company;

public class Main {

    public static void main(String[] args) {
        int blabla= 45;
        int counter = 0;
        while(true) {
            int number = 1 + (int)(Math.random() * 6);
            counter++;
            if(number == 6) {
                break;
            }
        }
        System.out.println("Es wurden " + counter + " Versuche benötigt.");
    }
}
