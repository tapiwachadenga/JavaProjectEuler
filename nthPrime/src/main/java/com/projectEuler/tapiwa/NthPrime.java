package com.projectEuler.tapiwa;

import java.math.BigInteger;

public class NthPrime
{
	public static boolean isPrime(BigInteger num)
	{
		for(BigInteger i = BigInteger.valueOf(2); i.compareTo(num.sqrt()) <= 0; i = i.add(BigInteger.ONE))
			if(num.mod(i).equals(BigInteger.ZERO))
				return false;
		return true;
	}

	public static BigInteger nthPrime(String nthString)
	{
		BigInteger nth = new BigInteger(nthString);
		if(nth.compareTo(BigInteger.ONE) <= 0) nth = BigInteger.ONE;

		// BigInteger counter = BigInteger.ZERO;
		BigInteger number = BigInteger.valueOf(2);
		while(nth.compareTo(BigInteger.ZERO) > 0)
		{
			if(isPrime(number)) 
				nth = nth.subtract(BigInteger.ONE);
			number = number.add(BigInteger.ONE);
			// System.out.printf("num = %s", number.toString());
		}
		number = number.subtract(BigInteger.ONE);
		return number;
	}
}
