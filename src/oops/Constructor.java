package oops;

public class Constructor {
	
	int emp_id;
	String emp_name;
	
	
	public Constructor(int id,String name) {                // Parameterized Constructor
		emp_id = id;
		emp_name = name;
		System.out.println(id+" "+emp_name);
	}

	public static void main(String[] args) {
		Constructor emp1 = new Constructor(121,"Swayam");
		Constructor emp2 = new Constructor(122,"John");

	}

}