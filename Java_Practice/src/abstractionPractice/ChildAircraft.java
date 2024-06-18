package abstractionPractice;

public class ChildAircraft extends ParentAbstractClass{

	public static void main(String[] args) {
		
		ChildAircraft ca = new ChildAircraft();
		
		ca.aircraft_EngineGuideLines();
		ca.safety_EngineGuideLines();
		ca.outer_Colour();
		
	}

	@Override
	public void outer_Colour() {
		System.out.println("Outer Colour is Red");
		
	}

}
