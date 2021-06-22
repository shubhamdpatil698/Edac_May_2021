//4. Write a program to find all pairs on an integer //array whose sum is equal to a given number?
//Eg :
//Input : 1 2 4 5 3 6 3 7
//Output: 3, 3 and 4, 2
//6,1 and 4 , 3

class Array4
{
	static void SumPArray(int arr[],int sum)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j] == sum)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}
	public static void main(String args[])
	{
		int arr[]={1,2,4,5,3,6,3,7};
		System.out.println("Enter the number : ");
		int sum1=Integer.parseInt(System.console().readLine());
		SumPArray(arr,sum1);
	
	}
}
