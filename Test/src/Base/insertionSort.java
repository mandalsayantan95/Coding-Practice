package Base;

public class insertionSort {

	public static void insSrt(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;++i)
		{
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
		arr[j+1]=key;
		}
	}
	public static void show(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {23,78,13,65,42,89,10};
		show(arr);
		insSrt(arr);
		show(arr);
	}

}
