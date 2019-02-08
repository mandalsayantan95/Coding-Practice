package Base;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
	
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

		//before reverse
		System.out.println(Arrays.toString(arr));
		
		//reverse
		int temp=0;
		
		for(int i=0;i<n/2;i++)
		{
		
		temp=arr[i];
		arr[i]=arr[n-i-1];	
		arr[n-i-1]=temp;
		
		}
		
		//after reverse
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}

}
