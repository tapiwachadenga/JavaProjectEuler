package com.projetcEuler.tapiwa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	/*
	String name = "Tapiwa";
	String str = String.format("Hey %s, welcome to the real world of Maven", name);
        System.out.printf( "\n\n%s\n", str );
	*/

	 System.out.printf("\nEnter limit: ");

	 Scanner sc = new Scanner(System.in);
	 int limit  = sc.nextInt();
	 System.out.printf("\nsumOfMult3And5(%d) = %d\n\n", limit, MultiplesOfThreeAndFive.multiplesOfThreeAndFive(limit));
    }
}
