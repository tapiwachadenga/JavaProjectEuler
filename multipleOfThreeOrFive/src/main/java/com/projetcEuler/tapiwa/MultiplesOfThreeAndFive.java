package com.projetcEuler.tapiwa;

class MultiplesOfThreeAndFive
{
	public static int multiplesOfThreeAndFive(int limit)
	{
		// HashSet<Integer> set = new HashSet<>();
		int sum = 0;

		for (int i = 1; i < limit; i++)
		{
			if(i % 3 == 0)
			       sum += i;
			else if(i % 5 == 0)
				sum += i;
		}
		return sum;	
	}
}
