package abstractionPractice;

public class ChildAircraft extends ParentAbstractClass{

	public static void main(String[] args) {
		
		ChildAircraft ca = new ChildAircraft();
		
		ca.aircraft_EngineGuideLines();
		ca.safety_EngineGuideLines();
		ca.colour();
		
	}

	@Override
	public void colour() {
		
		System.out.println("Colour");
	}


	

}
