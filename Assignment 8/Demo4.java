import java.util.*;
class Demo4
{
	public static void main(String args[])
	{
		TreeSet<Integer>t=new TreeSet<Integer>();
		/*TreeSet<String>t=new TreeSet<String>(new Mycomparator());
		t.add("Shubham");
		t.add("Patil");
		t.add("Jawale");
		t.add("Nalawade");
		t.add("Chavan");
		t.add("Patil");
		System.out.println(t);*/
		t.add(2);
		t.add(15);
		t.add(4);
		t.add(6);
		t.add(7);
		t.add(10);
		Iterator itr=t.iterator();
		/*while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println(s);
		}*/
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			if(i<7)
			{
				System.out.println(i);
			}
		}
		
	}
}
/*class Mycomparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1=(String)obj1;
		String s2=(String)obj2;
		return s2.compareTo(s1);
	}
}*/
