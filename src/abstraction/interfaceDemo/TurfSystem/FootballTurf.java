package abstraction.interfaceDemo.TurfSystem;

public class FootballTurf implements Turf {
	
	@Override
	public double getTurfPrice() {
		return 800;
	}

	@Override
	public String getTurfName() {
		return "FootBall Turf";
	}

}
