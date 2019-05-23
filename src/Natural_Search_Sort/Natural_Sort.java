package Natural_Search_Sort;

import java.util.ArrayList;
import java.util.Collections;

public class Natural_Sort {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("Neha");
	al.add("dheeraj");
	al.add("Dheeraj");
	al.add("Ram");
	al.add("Shyam");
	System.out.println("Before sorting String:"+al);
	Collections.sort(al);
	System.out.println(al);
}
}
