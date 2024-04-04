package java_Practice;


import java.util.Arrays;
import java.util.List;

public class Convert_NormalArray_To_ArrayList {

	public static void main(String[] args) {
		
		String [] name = {"Deep","Deepa","Devi","Devika","Dev","Devsena"};
		List<String> arraylistname =  Arrays.asList(name);
		System.out.println(arraylistname.contains("Devi"));
		

	}

}
