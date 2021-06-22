

class TwoeleRotate
{
	static int[] RotateNumber(int arr[])
	{
		int temp1=arr[0];
		int temp2=arr[1];
		for(int i=0;i<arr.length-2;i++)
		{
			arr[i]=arr[i+2];
		}
		arr[arr.length-2]=temp1;
		arr[arr.length-1]=temp2;
		return arr;
	}
	
	public static void main(String args[])
	{
		int element []= new int[7];
		for (int i=0;i<7;i++)
		{
			element[i]=Integer.parseInt(System.console().readLine());
		}
		int Temp[]=RotateNumber(element);
		for (int x:Temp)
		{
			System.out.print(x+" ");
		}
	}

}
