package oop19.collections01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {
		List<Integer> aList1 = new ArrayList<>(); // capacity = 10
		List<Integer> aList2 = new ArrayList<>(30); // capacity = 30
		List<Integer> aList3 = new Vector<>(); // capacity = 10
		List<Integer> aList4 = new Vector<>(20); // capacity = 20
		List<Integer> aList5 = new LinkedList<>(); // capacity = 10
//		List<Integer> aList6 = new LinkedList<>(30); // linked list는 초기 용량 선언 불가

		List<Integer> aList7 = Arrays.asList(1, 2, 3, 4);
		List<String> aList8 = Arrays.asList("hi", "hello");
		aList7.set(1, 7);
		aList8.set(0, "thanks");
//		aList7.add(5);
//		aList8.remove(0);
		System.out.println(aList7);
		System.out.println(aList8);

	}
}
