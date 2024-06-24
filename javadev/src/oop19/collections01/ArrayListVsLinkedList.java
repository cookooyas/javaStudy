package oop19.collections01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		List<Integer> ll = new LinkedList<>();
		long startTime = 0, endTime = 0;
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++)
			al.add(0, i);
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 추가 시간 : " + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++)
			ll.add(0, i);
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 추가 시간 : " + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++)
			al.get(i);
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 탐색 시간 : " + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++)
			ll.get(i);
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 탐색 시간 : " + (endTime - startTime));

		/*
		 * ArrayList 데이터 추가 시간 : 725644100 
		 * LinkedList 데이터 추가 시간 : 23403100 
		 * ArrayList 데이터 탐색 시간 : 2862100 
		 * LinkedList 데이터 탐색 시간 : 5388871000
		 */

	}
}
