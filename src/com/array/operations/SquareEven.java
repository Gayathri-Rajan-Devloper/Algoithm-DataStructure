package com.array.operations;

public class SquareEven {
	
	public static void main (String[] args)
	{
		int[] arr = new int[] {9, -2, -9, 11, 56, -12, -3};
		int len = arr.length;
		int [] temp =printSquare(arr, len);
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]+" ");
		}
	}

	public static int[] printSquare(int[] arr,  int len) {
	
		int[] result = new int[len];
		int element=0;
		
		for(int i=0;i<result.length;i++)
		{
			element=arr[i];
			if(i%2==0)
			{
				element*=element;
			}
			
	       result[i]=element;
			
			
		}
		
		return result;
		
		
		
		
	}

}
