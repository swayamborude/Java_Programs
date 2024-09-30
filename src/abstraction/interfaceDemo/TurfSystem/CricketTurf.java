package abstraction.interfaceDemo.TurfSystem;

public class CricketTurf implements Turf {
	
	@Override
	public double getTurfPrice() {
		return 700;
	}

	@Override
	public String getTurfName() {
		return "Cricket Turf";
	}

}
