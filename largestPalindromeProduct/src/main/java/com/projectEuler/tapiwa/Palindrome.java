package com.projectEuler.tapiwa;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

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

	public static int largestPalindrome(int start, int end)
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
		// return arr.get(0);
		return Collections.max(arr);
		// int max = arr.get(0);

	}
}
