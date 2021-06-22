//2. Take an array of 10 elements. Split it into the middle and
//store the elements in two different arrays. E.g.-
//INITIAL array :
//1 2 3 4 5 6 7 8 9 10
//After splitting :
//Array 1 : 1 2 3 4 5
//Array 2 : 6 7 8 9 10

class Array2
{
	static void SplitArray(int arr[])
	{
		int x=0;
		int y=0;
		int len=(arr.length)/2;
		int newArr1[]= new int[len];
		int newArr2[]= new int[len];
		for (int i=0;i<arr.length;i++)
		{
			if(i<len)
			{
				newArr1[x++]=arr[i];
			}
			else
			{
				newArr2[y++]=arr[i];
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(newArr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<len;i++)
		{
			System.out.print(newArr2[i]+" ");
		}
		
		
	}
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		
		SplitArray(arr);
		
		
	}
}
