// Insertion Sorting

class Sorting{
	public int [] InsertionAlgorithm(int arr[])
	{
		int n= arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
				
			}
			arr[j+1]=key;
			
		}
		return arr;
	}
	public void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
class InsertionSort
{
	public static void main(String args[])
	{
		Sorting str = new Sorting();
		int array[]={4,3,2,10,12,1,5,6};
		System.out.println("Sorted array ");
		array=str.InsertionAlgorithm(array);
		str.display(array);
	}
}



