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
	System.out.printf("\nEnter number of digits: ");
	int digits = new Scanner(System.in).nextInt();
	
	System.out.printf("\nlargestPalindromeProd(%d, %d) = %d\n", Palindrome.rangeFinder(digits)[0], Palindrome.rangeFinder(digits)[1], Palindrome.largestPalindromeProduct(digits));
    }
}
