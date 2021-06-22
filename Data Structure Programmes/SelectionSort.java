//Selection sorting

class Sorting
{
	public int [] SelectionAlgorithm(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					min=j;
				}
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
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


class SelectionSort
{
	public static void  main(String args[])
	{
		Sorting str= new Sorting();
		int array[]={7,5,4,2};
		System.out.println("Selection sorted array ");
		array=str.SelectionAlgorithm(array);
		str.display(array);
	}
}