package Customised_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Coustm_sort {
public static void main(String[] args) {
	ArrayList<String> al= new ArrayList<String>();
	al.add("Neha");
	al.add("dheeraj");
	al.add("Dheeraj");
	al.add("Ram");
	al.add("Shyam");
	System.out.println("Before sorting String:"+al);
	
	Collections.sort(al, new MyComparator());;
	System.out.println("After sort"+al);
}
}
