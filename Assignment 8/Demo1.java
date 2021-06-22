
import java.util.*;
class Demo1
{
	public static void main(String args[])
	{
		List<String>list=new ArrayList<String>();
		list.add("Shubham");
		list.add("Patil");
		list.add("Jawale");
		list.add("Nalawade");
		list.add("Chavan");
		System.out.println(list);
		System.out.println(list.contains("Patil"));
		list.remove("Chavan");
		System.out.println(list);
		System.out.println(list.get(3));
		Collections.sort(list);
		System.out.println(list);
		list.set(0,"Sanjay");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}