package com.projectEuler.tapiwa;

import java.util.Scanner;
import java.math.BigInteger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print( "\nEnter number: " );
	String num = new Scanner(System.in).next();
	System.out.printf("\nnthPrime(%s) = %s\n", num, NthPrime.nthPrime(num).toString());
    }
}
