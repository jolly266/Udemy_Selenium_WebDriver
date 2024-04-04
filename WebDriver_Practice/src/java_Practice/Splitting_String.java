package java_Practice;

public class Splitting_String {

	public static void main(String[] args) {

		/*
		 * String name = " Automation";
		 * 
		 * for(int i=0;i<name.length();i++) { System.out.println(name.charAt(i)); }
		 */
		String name2 = " Automation Test Engineer";
		String[] splittedstring = name2.split(" ");
		System.out.println(splittedstring[3]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);

	}

}
