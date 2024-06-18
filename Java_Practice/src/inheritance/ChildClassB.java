package inheritance;

public class ChildClassB extends ParentClassA{

	int a=20;
	public void colour() {
		System.out.println(colour);
	}
	
	public void tyre() {
		System.out.println("Tyre Implemented");
	}
	
	public static void main(String[] args) {
		
		ChildClassB ch = new ChildClassB();
		ch.breaks();
		ch.engine();
		ch.colour();
		ch.tyre();
		System.out.println(ch.a);
		
		System.out.println();
		System.out.println();
		
		ParentClassA pa = new ChildClassB();
		pa.breaks();
		pa.engine();
		System.out.println(pa.a);
	}
}
