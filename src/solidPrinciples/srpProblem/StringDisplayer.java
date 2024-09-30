package solidPrinciples.srpProblem;

public class StringDisplayer {
	
	StringManipulator stringManip;
	
	public StringDisplayer() {} 
	public StringDisplayer(StringManipulator k)
	{
		this.stringManip=k;
	}
	
	public void displayName()
	{
		System.out.println(this.stringManip.name);
	}
	
	public void displayUppercase()
	{
		System.out.println(this.stringManip.name.toUpperCase());

	}
	public void displayLowercase() {
		
		System.out.println(this.stringManip.name.toLowerCase());
	}
	
	public void diaplayNameWithDoller() {
		for(char c:this.stringManip.name.toCharArray())
		{
			if(c == ' ')
			{
				System.out.print("$");
			}
			else
			{
				System.out.print(c);
			}
		}
	}
	
	public void displayIndividualWord()
	{
		String arr[] = this.stringManip.name.split(" ");
		for(String s:arr)
		{
			System.out.println(s);
		}
	}

}
