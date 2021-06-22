//Bubble sort Algorithm


class BubbleSort
{
	public static void main(String args[])
	{
		Sorting srt=new Sorting();
		int array[]={5,3,8,3,4,6};
		array=srt.BubbleAlgorith(array);
		System.out.println("Bubble Sorted array ");
		srt.display(array);
	}
}
class Sorting
{
	public int [] BubbleAlgorith(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public void display(int arr[])
	{
		for(int i=0;i< arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}


