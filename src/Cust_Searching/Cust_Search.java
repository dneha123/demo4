package Cust_Searching;

import java.util.ArrayList;
import java.util.Collections;

public class Cust_Search {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(50);
		al.add(56);
		al.add(23);
		al.add(15);
		System.out.println("Before searching"+al);
		Collections.sort(al, new MyComparator());
		System.out.println("After sort"+ al);
		
		System.out.println("After sorting list:"+Collections.binarySearch(al, 57, new MyComparator()));
	}

}
