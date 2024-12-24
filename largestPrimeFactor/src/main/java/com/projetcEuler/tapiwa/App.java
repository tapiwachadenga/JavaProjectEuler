package com.projectEuler.tapiwa;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.printf( "\nEnter number: " );
	String number = new Scanner(System.in).next();
	System.out.printf("\nlargestPrimeFactor(%s) = %s\n", number, LargestPrimeFactor.largestPrimeFactor(number).toString());
    }
}
