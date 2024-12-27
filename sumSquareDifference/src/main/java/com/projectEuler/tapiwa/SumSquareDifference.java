package com.projectEuler.tapiwa;

import java.util.Scanner;
import java.math.BigInteger;

public class SumSquareDifference
{
	public static BigInteger sumOfSquares(BigInteger[] arr)
	{
		BigInteger acc = BigInteger.ZERO;
		for(int i = 0; i < arr.length; i++)
			acc = acc.add(arr[i].pow(2));
		return acc;
	}

	public static BigInteger squareOfSum(BigInteger[] arr)
	{
		BigInteger acc = BigInteger.ZERO;

		for(int i = 0; i < arr.length; i++)
			acc = acc.add(arr[i]);
		return acc.pow(2);
	}

	public static BigInteger[] getArray(int upperLimit)
	{
		if(upperLimit < 0) upperLimit *= -1;
	        if(upperLimit == 0) return new BigInteger[]{BigInteger.ZERO};

		BigInteger[] arr = new BigInteger[upperLimit];
		for (int i = 0; i < upperLimit; i++)
			arr[i] = BigInteger.valueOf(i + 1);
		return arr;
	}

	public static BigInteger sumSqureDifference(int uLmt)
	{
		BigInteger[] arr = getArray(uLmt);
		return squareOfSum(arr).subtract(sumOfSquares(arr)); 
	}
}
