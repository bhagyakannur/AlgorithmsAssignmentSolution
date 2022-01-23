package com.greatlearning.stockers.model;

public class CountComp {

	public int countCompaniesInProfit(boolean array[]) {
		int count =0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==true)
				count++;
		}
		return count;
	}

}
