package collection_HasSet;

import java.util.HashSet;
import java.util.Iterator;

public class Set_Practice {

	public static void main(String[] args) {
		
	//Hashset,TreeSet,Linkedhashset implements set Interface		
	// Set Interface does not duplicates value
	//There is no gaureente elements stores in sequential Order they may store random order
		
		
	HashSet<String>	hs = new HashSet<String>();
	hs.add("UK");
	hs.add("India");
	hs.add("Britain");
	hs.add("USA");
	
	System.out.println(hs);
	
	hs.add("UK");
	System.out.println(hs);

	hs.remove("USA");
	System.out.println(hs);

	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
		
	Iterator<String> i = hs.iterator();
	
	for(int j=0;j<hs.size();j++) {
		
	System.out.println(i.next());	
	}
		
	}

}
