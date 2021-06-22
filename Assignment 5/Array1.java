//1. If the input array is [10, 12, 20, 30, 25, 40, 32, //31, 35, 50,60], your program should be able to find //that thesubarray lies between the indexes 3 and 8.
//Output: 30,25,40,32,31,35

class Array1
{
	static void SubArray(int arr[],int startIndex,int endIndex)
	{
		int s1=endIndex-startIndex+1;
		int x=0;
		int newArr[]= new int[s1];
		for (int i=startIndex;i<=endIndex;i++)
		{
			newArr[x++]=arr[i];
		}
		for(int i=0;i<newArr.length;i++)
		{
			System.out.print(newArr[i]+" ");
		}
		
		
	}
	public static void main(String args[])
	{
		int arr[]={10, 12, 20, 30, 25, 40, 32,31, 35, 50,60};
		System.out.println("Enter the Starting index element : ");
		int startIndex1=Integer.parseInt(System.console().readLine());
		System.out.println("Enter the Ending index element : ");
		int endIndex1=Integer.parseInt(System.console().readLine());
		SubArray(arr,startIndex1,endIndex1);
		
		
	}
}