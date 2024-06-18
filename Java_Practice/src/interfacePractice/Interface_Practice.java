package interfacePractice;

public class Interface_Practice implements Interface2, Interface1 {

	int a=8;
	@Override
	public void add() {
		

		System.out.println(Interface1.a+ b);
	}

	@Override
	public void subtract() {

		System.out.println(a - b);
	}

	@Override
	public void multiple() {

		System.out.println(a * b);
	}

	@Override
	public void devide() {

		System.out.println(a / b);
	}

	public void percentile() {
		System.out.println(a % b);

	}

	public static void main(String[] args) {

		Interface1 inter1 = new Interface_Practice();
		Interface2 inter2 = new Interface_Practice();
		Interface_Practice inter3 = new Interface_Practice();

		inter1.add();
		inter1.subtract();
		inter1.multiple();
		inter2.devide();
		inter3.percentile();
	}
}
