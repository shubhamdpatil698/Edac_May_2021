


class MissNumber
{
	static int Number(int arr[])
	{
		int xor=0;
		for(int num:arr)
		{
			xor=xor^num;
		}
		for(int i=1;i<=arr.length;i++)
		{
			xor=xor^i;
		}
		return xor;
	}
	public static void main (String args[])
	{
		int size=Integer.parseInt(System.console().readLine());
		int element []= new int[size];
		for (int i=0;i<size-1;i++)
		{
			element[i]=Integer.parseInt(System.console().readLine());
		}
		System.out.println("Missing Number is : "+Number(element));
	}

}