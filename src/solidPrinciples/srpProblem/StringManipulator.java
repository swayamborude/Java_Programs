package solidPrinciples.srpProblem;

public class StringManipulator {
	
	public String name;
	
	public StringManipulator()
	{
		
	}
	public StringManipulator(String name)
	{
		this.name=name;
	}
	
	public void getSubString()
	{
		this.name=name.substring(9, 14);
	}
	public void modifyString(String newName, String oldName)
	{
		this.name=name.replace(oldName, newName);
		
	}
	

}
