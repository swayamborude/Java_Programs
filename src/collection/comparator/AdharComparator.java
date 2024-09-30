package collection.comparator;

import java.util.Comparator;

public class AdharComparator implements Comparator<PersonData> {

	@Override
	public int compare(PersonData p1, PersonData p2) {
		if (p1.getAdharNo() > p2.getAdharNo())
	    return 1;
	else if (p1.getAdharNo() < p2.getAdharNo())
		return -1;
	else
		return 0;
}
	
}
