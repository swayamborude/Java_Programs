package collection.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<PersonData> {

	@Override
	public int compare(PersonData p1, PersonData p2) {
		if (p1.getAge() > p2.getAge())
	    return 1;
	else if (p1.getAge() < p2.getAge())
		return -1;
	else
		return 0;
	}

}
