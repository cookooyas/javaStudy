package oop19.collections02;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod01 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		for (int i = 20; i > 0; i -= 2) {
			tm.put(i, i + "번째 데이터");
		}
		System.out.println(tm.toString());
		System.out.println(tm.firstKey());
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastKey());
		System.out.println(tm.lastEntry());
		System.out.println(tm.lowerKey(11));
		System.out.println(tm.lowerKey(10));
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.toString());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.toString());

		SortedMap<Integer, String> sm = tm.headMap(8); // 키가 8 미만인 모든 엔트리를 모은 맵
		System.out.println(sm);
		NavigableMap<Integer, String> nm = tm.headMap(8, true);
		System.out.println(nm);
		sm = tm.tailMap(14);
		System.out.println(sm);
		nm = tm.tailMap(14, false);
		System.out.println(nm);

		sm = tm.subMap(6, 10);
		System.out.println(sm);

		nm = tm.subMap(6, false, 10, true);
		System.out.println(nm);

		NavigableSet<Integer> ns = tm.descendingKeySet();
		System.out.println(ns.toString());
		System.out.println(ns.descendingSet());
		nm = tm.descendingMap();
		System.out.println(nm.toString());
		System.out.println(nm.descendingMap());
	}
}
