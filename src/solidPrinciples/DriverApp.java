package solidPrinciples;

public class DriverApp {
	
	public static void main(String[] args) {
		
		StringManipulatorDisplayer smd = new StringManipulatorDisplayer("Mahendra Singh Dhoni"); 
		smd.displayName();                       //Display Total String
		//smd.getSubString();            
		//smd.displayName();                     //Display Particular String
		smd.modifyString("Kumar", "Singh");
		smd.displayName();                       //Display modify String
	}

}
