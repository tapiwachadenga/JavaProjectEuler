package com.projectEuler.tapiwa;

import java.math.BigInteger;

public class SmallestCommonMultiple
{
	/*
	public static BigInteger[] smallestCommonMultipleValidator(int lowerLimit, int upperLimit)
	{
		if (lowerLimit < 0) lowerLimit *= -1;
		if (upperLimit < 0) upperLimit *= -1;
		if (lowerLimit == upperLimit) upperLimit += 1;

		if(lowerLimit > upperLimit)
		{
			int temp = lowerLimit;
			lowerLimit = upperLimit;
			upperLimit = temp;
		}
		return new BigInteger[] {BigInteger.valueOf(lowerLimit), BigInteger.valueOf(upperLimit)};
	}

	public static BigInteger smallestCommonMultiple(int  lowerLimit, int upperLimit)
	{
		BigInteger[] limits = smallestCommonMultipleValidator(lowerLimit, upperLimit);
		BigInteger factor = BigInteger.ONE;
		BigInteger multiple = limits[1];

		while(factor.compareTo(BigInteger.ZERO) > 0)
		{
			multiple = multiple.multiply(factor);
			for(BigInteger i = limits[1]; i.compareTo(limits[0]) > 0; i.subtract(BigInteger.ONE))
			{
				System.out.printf("\nmultiple = %s \t i = %s \n", multiple.toString(), i.toString());
				if(!isDivisible(multiple, i))
				{
					factor.add(BigInteger.ONE);
					i = limits[1];
					// break;
				}
				factor.add(BigInteger.ONE);
				break;
			}
			break;
		}

		return multiple;
	}

	public static boolean isDivisible(BigInteger divisor, BigInteger quotient)
	{
		if (quotient.divide(divisor) == BigInteger.ZERO)
			return true;
		return false;
	}
	*/

	public static BigInteger lcm(BigInteger bi_1, BigInteger bi_2)
	{
		return (bi_1.multiply(bi_2)).divide(bi_1.gcd(bi_2));
	}

	public static BigInteger[] smallestCommonMultipleRange(String lowerLimit, String upperLimit)
	{
		BigInteger lLmt = new BigInteger(lowerLimit);
		BigInteger uLmt = new BigInteger(upperLimit);

		if (lLmt.signum() < 0) lLmt = lLmt.negate();
		if (uLmt.signum() < 0) uLmt = uLmt.negate();
		if (lLmt.equals(uLmt)) return new BigInteger[]{lLmt};
		if(lLmt.compareTo(uLmt) > 0)
		{
			BigInteger temp = lLmt;
			lLmt = uLmt;
			uLmt = temp;
		}

		BigInteger[] biArray = new BigInteger[(uLmt.subtract(lLmt)).intValue() + 1];

		int j = 0;
		for( BigInteger i = lLmt; i.compareTo(uLmt) <= 0; i = i.add(BigInteger.ONE))
		{
		       biArray[j] = i;
		       j++;
		}

		return biArray;
	}

	public static BigInteger smallestCommonMultiple(BigInteger[] biArray)
	{
		BigInteger result = biArray[0];
		for(int i = 0; i < biArray.length; i++)
			result = lcm( result, biArray[i]);
		return result;
	}
}
