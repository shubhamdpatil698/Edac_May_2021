import java.util.*;
class Demo3
{
	public static void main(String args[])
	{
		HashSet<String>h=new HashSet<String>();
		LinkedList<String>listnew=new LinkedList<String>();
		h.add("Shubham");
		h.add("Patil");
		h.add("Jawale");
		h.add("Nalawade");
		h.add("Chavan");
		h.add("Patil");
		System.out.println(h);
		System.out.println(h.size());
		
		String [] arr=h.toArray(new String[0]);
		for(String x:arr)
		{
			System.out.println(x);
		}
		TreeSet<String>t=new TreeSet<String>(h);
		System.out.println(t);
		
		ArrayList<String >list=new ArrayList<String>(h);
		System.out.println(list);
		
		h.clear();
		System.out.println(h);
		
	}
}