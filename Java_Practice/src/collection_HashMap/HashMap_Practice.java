package collection_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Practice {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hellow");
		hm.put(1, "Bye");
		hm.put(2, "Goodby");
		hm.put(3, "Morning");
		
		System.out.println(hm.get(2));
		
		hm.remove(2);
		System.out.println(hm.get(2));
		
		Set	sn =hm.entrySet();
		Iterator it = sn.iterator();	
		while(it.hasNext())
		{
		Map.Entry mp  = (Map.Entry)it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		}		
	}

}
