package abstraction.interfaceDemo.TurfSystem;

public class TennisTurf implements Turf {
	
	@Override
	public double getTurfPrice() {
		return 1000;
	}

	@Override
	public String getTurfName() {
		return "Tennis Turf";
	}

}
