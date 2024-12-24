package com.projectEuler.tapiwa;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.lang.Math;

public class Palindrome
{
	public static boolean isPalindrome(int number)
	{
		String strNumber = String.valueOf(number);
		int start = 0;
		int end = strNumber.length() - 1;
		// System.out.printf("\n%d\t%d\n", start, end);
		// return end;
		while(start < end)
		{
			if(strNumber.charAt(start) != strNumber.charAt(end))
			       return false;
			start++;
			end--;	
		}
		return true;
	}

	public static int largestPalindromeProduct(int numberOfDigits)
	{
		return largestPalindromeHelper(rangeFinder(numberOfDigits)[0], rangeFinder(numberOfDigits)[1]);
	}
	public static int largestPalindromeHelper(int start, int end)
	{
		if(start > end)
		{
			int temp = start;
			start = end;
			end = temp;
		}

		if(start == end)
			end += 1;

		List<Integer> arr = new ArrayList<>();
		for (int i = end; i >= start; i--)
			for (int j = end; j >= start; j--)
			{
				int product = i * j;
				if(isPalindrome(product))
					arr.add(product);
			}	
		return Collections.max(arr);
	}
	
	public static int[] rangeFinder(int numberOfDigits)
	{
		int[] arr = new int[2];

		if(numberOfDigits <= 0 || numberOfDigits > 9)
			throw new IllegalArgumentException("\nEnter number of digits from 0 to 9.\n");
		
		arr[0] = (int)Math.pow( 10, numberOfDigits - 1 );
		
		arr[0] = arr[0] == 1 ? 0: arr[0];

		arr[1] = arr[0] * 10 - 1;
		if(arr[1] < 0) arr[1] = 9;

		return arr; 
	}
}
