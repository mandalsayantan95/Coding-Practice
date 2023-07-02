package src.Base;

public class selectionSort {
	
	public static void selsrt(int[]arr)
	{	
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}	
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i]=temp;	
				
		}
	}
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }

	public static void main(String[] args) 
	{	
		int[] arr = {10,72,16,52,28,39};
		
		printArray(arr);
		
		selsrt(arr);
		
		printArray(arr);
	}

}
