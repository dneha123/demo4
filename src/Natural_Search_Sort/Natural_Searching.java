package Natural_Search_Sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Natural_Searching {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(1);
	al.add(50);
	al.add(56);
	al.add(23);
	al.add(15);
	System.out.println("Before searching"+al);
	Collections.sort(al);
	System.out.println("After sorting list:"+al);
	System.out.println(Collections.binarySearch(al, 10));
	
}
}
