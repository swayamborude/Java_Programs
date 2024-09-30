package abstraction.interfaceDemo.TurfSystem;

public interface Turf {
	
	double getTurfPrice();
	String getTurfName();
	default String companyName() 
	{
		return "Champion Turf";
	}
	
	//this default is same as all classes.
	//in java 8 version new feature come in interface which is default

}
