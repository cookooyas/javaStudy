package oop19.collections01;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethod01 {
	public static void main(String[] args) {
		TreeSet<Integer> ts1 = new TreeSet<>();
		for (int i = 50; i > 0; i -= 2) {
			ts1.add(i);
		}
		System.out.println(ts1.toString());
		System.out.println(ts1.first());
		System.out.println(ts1.last());
		System.out.println(ts1.lower(26));
		System.out.println(ts1.higher(26));
		System.out.println(ts1.floor(25));
		System.out.println(ts1.floor(26));
		System.out.println(ts1.ceiling(25));
		System.out.println(ts1.ceiling(26));
		System.out.println();

		int tsSize = ts1.size();
		System.out.println(tsSize);
		for (int i = 0; i < tsSize; i++) {
			System.out.print(ts1.pollFirst() + " ");
		}
		System.out.println();
		System.out.println(ts1.size());
		for (int i = 50; i > 0; i -= 2)
			ts1.add(i);
		SortedSet<Integer> ss1 = ts1.headSet(20);
		System.out.println(ss1.toString());
		NavigableSet<Integer> ns1 = ts1.headSet(20, true);
		System.out.println(ns1.toString());
		ns1 = ts1.headSet(20, false);
		System.out.println(ns1.toString());
		ss1 = ts1.tailSet(20);
		System.out.println(ss1.toString());
		ns1 = ts1.tailSet(20, true);
		System.out.println(ns1.toString());
		ns1 = ts1.tailSet(20, false);
		System.out.println(ns1.toString());
		ss1 = ts1.subSet(10, 20);
		System.out.println(ss1.toString());
		ns1 = ts1.subSet(10, true, 20, false);
		System.out.println(ns1.toString());
		ns1 = ts1.subSet(10, false, 20, true);
		System.out.println(ns1.toString());
		System.out.println(ts1);
		NavigableSet<Integer> ds1 = ts1.descendingSet();
		System.out.println(ds1);
		ds1 = ds1.descendingSet();
		System.out.println(ds1);
	}
}
