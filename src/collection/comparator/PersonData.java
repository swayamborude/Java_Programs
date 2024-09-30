package collection.comparator;

public class PersonData  {
	
	private long adharNo;
	private String name;
	private int age;
	
	public PersonData() {}                                       //non parameterized constructor
	 
	public PersonData(long adharNo, String name, int age) {      //parameterized constructor
		this.adharNo = adharNo;
		this.name = name;
		this.age = age;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [adharNo=" + adharNo + ", name=" + name + ", age=" + age + "]";
	}
	

}
