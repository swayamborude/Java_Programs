package abstraction.interfaceDemo;

public interface Shape {
	
    //	An Interface could only have abstract methods.(means without body)
    //	means does not any implementation.
    //	In interface methods compulsory to abstract methods,
    //	if does not override all methods so in that case these class
    //	become abstract class.
	
	int RADIUS=5;
	
	// This data is static and final and final variables always write in Capital
    // This RADIUS value has gone into all classes,
    // but this value cannot manipulate any class because,
    // this value is by default Final and Static.
	
	void area();        //This method is public and abstract also
	void perimeter();   //This method is public and abstract also

}
