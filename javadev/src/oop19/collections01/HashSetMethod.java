package oop19.collections01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {
	public static void main(String[] args) {
		Set<String> hs1 = new HashSet<>();
		hs1.add("가");
		hs1.add("나");
		hs1.add("가");
		System.out.println(hs1.toString());
		Set<String> hs2 = new HashSet<>();
		hs2.add("나");
		hs2.add("다");
		hs2.addAll(hs1);
		System.out.println(hs2.toString());
		hs2.remove("나");
		System.out.println(hs2.toString());
		hs2.clear();
		System.out.println(hs2.toString());
		System.out.println(hs2.isEmpty());
		Set<String> hs3 = new HashSet<>();
		hs3.add("가");
		hs3.add("나");
		hs3.add("다");
		System.out.println(hs3.contains("나"));
		System.out.println(hs3.contains("라"));
		System.out.println(hs3.size());
		Iterator<String> it = hs3.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Object[] objArr = hs3.toArray();
		System.out.println(Arrays.toString(objArr));
		String[] strArr = hs3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArr));
		String[] strArr2 = hs3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArr2));
	}
}
