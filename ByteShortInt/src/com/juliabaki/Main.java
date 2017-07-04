package com.juliabaki;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myMinValue = -2_147_483_648;
	    int myMaxValue = 2_147_483_647;
	    int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
	    byte myByteValue = 10;
	    byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
	    short myShortValue = 32767;
	    short myNewShortValue = (short)(myShortValue/2);
		System.out.println("myNewShortValue = " + myNewShortValue);

        // short has a width of 64
	    long myLongValue = 100L;


	    //Challange
		//1. Create a byte variable and set it to any valid byte number

		byte myByteVar = 12;

		//2. Create a short variable and set it to any valid short number

		short myShortVar = 1777;

		//3. Create a int variable and set it to any valid int number

		int myIntVar = 5555;

		//4. Create a variable of type long, and make it equal to
		//   50000 + 10 times the sum of the byte plus the short plus the int

		long myNewTotal = 50000L + 10L * (myByteVar + myShortVar + myIntVar);
		System.out.println("myNewTotal = " + myNewTotal);

		short shortTotal = (short)(1000 + 10 * (myByteVar + myShortVar + myIntVar));
		System.out.println("shortTotal = " + shortTotal);

    }
}
