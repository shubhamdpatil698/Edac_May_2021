import java.util.*;
class Array
{
    int count=0;
    public int searchElement(int a[],int b)
    {
        for(int i=0; i<a.length;i++)
        {
            if (a[i]==b)
            {
                return count;
            }
            count++;
        }
        return -1;

    }
}


class TestClass {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
       Array list = new Array();
        int a=sc.nextInt();
        int b=sc.nextInt();
         int arr[]=new int[a];
        for(int i=0; i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println(list.searchElement(arr,b));

    }
}
