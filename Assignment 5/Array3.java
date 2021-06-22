//3. Write a program to shift every element of an array //to circularly right. E.g.-
//INPUT : 1 2 3 4 5
//OUTPUT : 5 1 2 3 4
//4 5 1 2 3
//3 4 5 1 2
//2 3 4 5 1
//1 2 3 4 5


class Array3
{
	static void ShiftArray(int arr[])
	{
		
		for(int k=0; k<arr.length;k++)
		{	
	     int temp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
	}
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		
		ShiftArray(arr);
		
		
	}
}
