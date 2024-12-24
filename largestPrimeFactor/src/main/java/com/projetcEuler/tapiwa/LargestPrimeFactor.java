package com.projectEuler.tapiwa;

import java.lang.Math;
import java.math.BigInteger;

class LargestPrimeFactor
{
	public static BigInteger largestPrimeFactor(String strNumber)
	{
		BigInteger factor = BigInteger.ZERO;
		BigInteger number = new BigInteger(strNumber);
		BigInteger two = BigInteger.valueOf(2);

		for( BigInteger i = two ; i.compareTo(number) <= 0; i = i.add(BigInteger.ONE))
		{
			while (number.mod(i) == BigInteger.ZERO)
			{
				System.out.printf("\n%s", number.toString());
				factor = number;
				number = number.divide(i);
			}
		}
		return factor;
	} 
}
