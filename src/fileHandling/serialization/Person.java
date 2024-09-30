package fileHandling.serialization;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 2840830226689342446L;
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
        return "Person{name='" + name + "', age=" + age + "}";
    }
	
	
	

}
