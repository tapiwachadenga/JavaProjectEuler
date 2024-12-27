package com.projectEuler.tapiwa;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	BigInteger[] arr = {BigInteger.ONE, BigInteger.valueOf(3), BigInteger.valueOf(5), BigInteger.valueOf(7) };
       	System.out.printf("Enter upper limit: ");
	int ulmt = new Scanner(System.in).nextInt();	
        System.out.printf( "\nsumSqureDifference(%d) = %s\n", ulmt, SumSquareDifference.sumSqureDifference(ulmt) );
    }
}
