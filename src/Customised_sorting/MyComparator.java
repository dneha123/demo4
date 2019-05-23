package Customised_sorting;

import java.util.Comparator;
import java.util.function.IntConsumer;

public class MyComparator implements Comparator {

public int compare(Object obj1, Object obj2){ 
	String s1 = obj1.toString();
	String s2 = obj2.toString();
	return s2.compareTo(s1);
}
		
	
	}
