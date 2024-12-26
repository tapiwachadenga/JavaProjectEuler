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
        System.out.println();
        System.out.print( "Enetr lower limit: " );
	String lLimit = new Scanner(System.in).next();
        System.out.print( "Enetr upper limit: " );
	String uLimit = new Scanner(System.in).next();
	BigInteger[] range = SmallestCommonMultiple.smallestCommonMultipleRange(lLimit, uLimit);

        System.out.println();
	System.out.printf( "\nsmallestCommonMultiple(%s, %s) = %s\n", lLimit, uLimit, SmallestCommonMultiple.smallestCommonMultiple(range) );	
        System.out.println();
    }
}
