import java.lang.*;
import java.util.*;

class HT
{
	public static void main(String arg[])
	{
		//Integer is key
		//string is value
	  Hashtable<Integer,String>obj = new Hashtable<Integer,String>();
	  
	  obj.put(11,"Rohit");
      obj.put(22,"Rajshri");
	  obj.put(23,"Avinash");
	  obj.put(24,"Dipali");
	  obj.put(25,"pillu");
	  
	  System.out.println("Chappal is:"+obj.get(23));
	 
	  System.out.println("Data from hashtable");
	  
	 Enumaration eobj = obj.keys();
	  
	}
}
