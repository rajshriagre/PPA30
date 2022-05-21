import java.lang.*;
import java.util.*;

class AL
{
	public static void main(String arg[])
	{
		ArrayList<String>obj = new ArrayList<String>();
		obj.add("January");
		obj.add("February");
		obj.add("March");
		obj.add("April");
		obj.add("May");
		
		System.out.println("ArrayList contais:"+obj);
	    System.out.println("Size is:"+obj.size());
		
		if(obj.contains("April"))
		{
	   System.out.println("Contains are there");
		}
	      int ret = obj.indexOf("April");
	      System.out.println("elements is at:"+ret);
	      System.out.println("elements at index 3 is:"+obj.get(3));
	
	        obj.remove(3);
	        obj.remove("April");
	        System.out.println("updated list is:"+obj);
	
	        Iterator iobj = obj.iterator();
			while(iobj.hasNext())
			{
				System.out.println(iobj.next());
			}
			
			obj.clear();
	        System.out.println("updated list is:"+obj);
	}
}