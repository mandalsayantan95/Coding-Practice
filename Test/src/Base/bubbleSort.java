package src.Base;

public class bubbleSort {
	
	public static void bblsrta(int arr[])
	{	
		int n= arr.length;
		int i,j,temp;
		boolean swapped;
		for(i=0;i<n-1;i++)
		{	
			swapped = false;
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}
			}
			if(swapped==false)
			{
				break;
			}
		}
	}
	
	public static void bblsrt(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}	
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
	
	public static void main(String[] args) {
	
		int arr[] = {25,85,12,03,96,75,66};
		show(arr);
		bblsrta(arr);
		show(arr);
	}

}
