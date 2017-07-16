package com.juliabaki;

public class Main {

    public static void main(String[] args) {
        //width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode character: " + myChar);

        boolean myBoolean = true;
        boolean isEasy = true;

        char registeredSymbol = '\u00AE';
        char coffeeSymbol = '\u2615';

        System.out.println("Registered and Coffee Symbols: " + registeredSymbol + coffeeSymbol);
    }
}
