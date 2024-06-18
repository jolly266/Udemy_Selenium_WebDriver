package collection_ArrayList;

public class ArrayList {

	public static void main(String[] args) {
		
	java.util.ArrayList<String> a = new java.util.ArrayList<String>();

		a.add("Jay");
		a.add("Krishna");
		a.add("Gupta");
		System.out.println(a);
		
		a.add(0, "Shree");
		System.out.println(a);
		
		System.out.println(a.get(2));	
		
		System.out.println(a.contains("Kumar"));
		System.out.println(a.contains("Jay"));
		
		System.out.println(a.indexOf("Gupta"));
		System.out.println(a.isEmpty());	
		System.out.println(a.size());
		
		// ArrayList, LinkedList,Vector - Implementing List Interface
		// These Three Classes Accept Duplicate Data
		
		
		java.util.ArrayList<String> b = new java.util.ArrayList<String>();
	    b.add("apple");
	    b.add("banana");
	    b.add("cherry");
	    b.add("mango");
	    b.add("apple");
	    
	    System.out.println(b);
	    
	    b.remove(0);
	    System.out.println(b);
	    
	  System.out.println(b.contains("orange"));  
	  
	  System.out.println(b.size());
		
		for(int i = 0;i<b.size();i++) {
			
			System.out.println("Index  "+i+"  Value  "+a.get(i));
			
			
		}
		System.out.println(b.isEmpty());
	}

}
