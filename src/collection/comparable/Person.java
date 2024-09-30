package collection.comparable;

public class Person implements Comparable<Person>{
	
	private long adharNo;
	private String name;
	private int age;
	
	public Person() {}                                       //non parameterized constructor
	 
	public Person(long adharNo, String name, int age) {      //parameterized constructor
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

//  Comparable
	
//	@Override
//	public int compareTo(Person p3) {    // This compare by age
//		if (this.age > p3.age)
//		    return 1;
//		else if (this.age < p3.age)
//			return -1;
//		else
//			return 0;
//	}

//	@Override
//	public int compareTo(Person p1) {     // This compare by adharNo
//		if (this.adharNo > p1.adharNo)
//		    return 1;
//		else if (this.adharNo < p1.adharNo)
//			return -1;
//		else
//			return 0;
//	}

	@Override
	public int compareTo(Person p) {      // This compare by name
		return this.name.compareTo(p.name);
	}

}
