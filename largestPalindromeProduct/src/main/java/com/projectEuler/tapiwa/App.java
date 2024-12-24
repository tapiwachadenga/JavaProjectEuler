package com.projectEuler.tapiwa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print( "\nEnter start: " );
	int start = new Scanner(System.in).nextInt();
        System.out.print( "\nEnter end: " );
	int end = new Scanner(System.in).nextInt();
	System.out.printf("\nlargestPalindrome(%d, %d) = %d\n", start, end, Palindrome.largestPalindrome(start, end));
    }
}
