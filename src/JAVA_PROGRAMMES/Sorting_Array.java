package JAVA_PROGRAMMES;

import java.util.Arrays;

public class Sorting_Array {

	public static void main(String args[])
	{
		int a[] = {3,7,1,9,4,8,2};
		
		
		for (int i=0; i<a.length;i++)
		{
			System.out.println("before sorting "+ a[i]);
		}
		
		System.out.println("--------------------------------");
	   Arrays.sort(a);
	   
	   for (int j=0; j<a.length;j++)
		{
			System.out.println("After sorting "+ a[j]);
		}
	
		
	}
	
	
}
