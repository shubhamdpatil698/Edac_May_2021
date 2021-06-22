import java.util.*;
class Demo5
{
	public static void main(String args[])
	{
		HashMap<String,Integer>t=new HashMap<String,Integer>();
		t.put("Shubham",100);
		t.put("Patil",120);
		t.put("Jawale",150);
		t.put("Nalawade",130);
		t.put("Chavan",120);
		t.put("Patil",101);
		System.out.println(t);
		System.out.println(t.size());
		HashMap<String,Integer>h=new HashMap<String,Integer>(t);
	    System.out.println(h);
		t.clear();
		System.out.println(h);
		System.out.println(h.containsKey("Shubham"));
		System.out.println(h.containsValue(102));
		
		Set s= h.entrySet();
		Iterator itr= s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"  "+m1.getValue());
		}
		
		
	}
}

