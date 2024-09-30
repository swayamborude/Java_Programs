package solidPrinciples.srpProblem;

public class SRPDriver {

	public static void main(String[] args) {
		
		StringManipulator sm = new StringManipulator("Mahendra Singh Dhoni");
		
		StringDisplayer sd = new StringDisplayer(sm);
		sd.displayName();

//		sm.getSubString();
		
		sd.displayUppercase();
		sd.displayLowercase();
		sd.diaplayNameWithDoller();
		System.out.println();
		sd.displayIndividualWord();
		sd.displayName();

	}

}
