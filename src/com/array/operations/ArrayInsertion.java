package com.array.operations;

public class ArrayInsertion {

	public static void main(String[] args) {
		// Insertion of elements in the array
		
		int[] arr  = new int[6];
		int length =0;
		
		for(int i=0;i<3;i++)
		{
			arr[length]=i;
			length++;
		}

		
		arr[length]=10;
		length++;
		
	/**
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println("Element at Index "+i+" is "+arr[i]);
       }
       */
		//Shifting the elements to the right side of the array and adding 20 at index 0
       for(int j=3;j>=0;j--)
       {
    	   arr[j+1]=arr[j];
       }
       arr[0]=20;
   /**    for(int i=0;i<arr.length;i++)
       {
    	   System.out.println("Element at Index "+i+" is "+arr[i]);
       }
      */ 
       
       //Adding element at specified index
       for(int i=4;i>=2;i--)
       {
    	   arr[i+1]=arr[i];
       }
       
           arr[1]=30;
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println("Element at Index "+i+" is "+arr[i]);
       }
       
}
}