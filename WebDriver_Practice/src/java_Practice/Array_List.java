package java_Practice;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("Raha");
		a.add("Riya");
		a.add("Rahul");
		a.add("Rohan");
		a.add("Ranu");
		a.add("Sahu");
		a.add("Sanu");

			int count=0;
		for (int i = 0; i < a.size(); i++) {

			String actual =a.get(i);
			if(actual.startsWith("R"))
			{
				count++;
				System.out.println(actual);	
			}	
		}
		System.out.println(count);
	}
}
