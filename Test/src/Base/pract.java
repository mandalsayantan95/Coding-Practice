package src.Base;

import java.util.Scanner;

public class pract {
	
	static class Pair
	{
		int min;
		int max;	
	}
	
	static Pair getMinMax(int arr[],int n)
	{
	Pair minmax = new Pair();
	int i;
	
	if(n==1)
	{
		minmax.max = arr[0];
		minmax.min = arr[0];
		return minmax;
	}
	
	if(arr[0]>arr[1])
	{
		minmax.max = arr[0];
		minmax.min = arr[1];
		
	}
	else
	{	
		minmax.max = arr[1];
		minmax.min = arr[0];
	}
	
	for(i=2;i<arr.length;i++)
	{
		if(arr[i] > minmax.max)
		{
			minmax.max = arr[i];	
		}
		else if(arr[i]<minmax.min)
		{
			minmax.min= arr[i];
		}	
	}
	
	return minmax;
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arrray size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i=0;i<n;i++)
		{
		System.out.println("Please enter arr element for index :"+i+": ");
		arr[i] = sc.nextInt();
		}
		
		int arr_size = arr.length;
		Pair minmax = getMinMax(arr, arr_size); 
		
		System.out.println("Maximum value of array : "+minmax.max);
		System.out.println("Minimum value of array : "+minmax.min);
		sc.close();
	}

}
