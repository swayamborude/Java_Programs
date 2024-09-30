package collection.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<PersonData> {
		
	@Override
	public int compare(PersonData p1, PersonData p2) {
		return p1.getName().compareTo(p2.getName());
	}
}
