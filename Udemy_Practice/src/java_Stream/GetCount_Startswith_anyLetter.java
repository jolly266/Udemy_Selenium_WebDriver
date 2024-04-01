package java_Stream;

import java.util.ArrayList;

public class GetCount_Startswith_anyLetter {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Jwala");
		name.add("Jolly");
		name.add("Jay");
		name.add("Jyoti");
		name.add("Julee");
		name.add("Jyotasana");
		name.add("Jagat");
		name.add("jp");
		name.add("dev");
		 long count =  name.stream().filter(s->s.startsWith("D")).count();
		 System.out.println(count);
		
		 //Print Each name which has more letters than 4
		 name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		 
		 //Print First name which has more letters than 4
		 name.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));

	}

}
