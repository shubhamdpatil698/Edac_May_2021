import java.util.*;
class Demo2
{
	public static void main(String args[])
	{
		LinkedList<String>list=new LinkedList<String>();
		LinkedList<String>listnew=new LinkedList<String>();
		list.add("Shubham");
		list.add("Patil");
		list.add("Jawale");
		list.add("Nalawade");
		list.add("Chavan");
		System.out.println(list);
		list.addLast("Pardeshi");
		System.out.println(list);
		
		ListIterator itr= list.listIterator();
		/*while(itr.hasNext())
		{
			String name=(String) itr.next();
			if(name.equals("Jawale"))
			{
				break;
			}
			else
			{
				System.out.println(name);
			}
		}*/
		while(itr.hasNext())
		{
			itr.next();
		}
		while(itr.hasPrevious())
		{
			String name =(String)itr.previous();
			System.out.println(name);
		}
		list.addFirst("Jaydeep");
		list.addLast("Chavan");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		Collections.swap(list,0,5);
		System.out.println(list);
		
		listnew.add("Shubh");
		listnew.add("P");
		listnew.add("vhn");
		list.addAll(listnew);
		System.out.println(list);
		System.out.println(list.contains("Shubh"));
		
		String[] stringArray = list.toArray(new String[0]);
		 
		 for(String x:stringArray)
		 {
			 System.out.println(x);
		 }
		 LinkedList<String>list3=new LinkedList<String>();
		 for(String x:list)
		 {
			 list3.add(listnew.contains(x)?"yes":"no");
		 }
		 System.out.println(list3);
		 System.out.println(list.equals(listnew));
		  System.out.println(list.isEmpty());
		  list.set(3,"Shubh");
		   System.out.println(list);


		
		
		
	}
}