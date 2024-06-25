package oop19.collections02;

import java.util.Comparator;
import java.util.TreeMap;

class MyClass {
	int d1;
	int d2;

	public MyClass(int d1, int d2) {
		this.d1 = d1;
		this.d2 = d2;
	}

	@Override
	public String toString() {
		return "data1 = " + d1 + "을 갖고 있는 클래스.";
	}
}

class MyComparableClass implements Comparable<MyComparableClass> {
	int d1;
	int d2;

	public MyComparableClass(int d1, int d2) {
		// TODO Auto-generated constructor stub
		this.d1 = d1;
		this.d2 = d2;
	}

	@Override
	public int compareTo(MyComparableClass o) {
		if (this.d1 < o.d1)
			return -1;
		else if (this.d1 == o.d1)
			return 0;
		else
			return 1;
	}

	@Override
	public String toString() {
		return "data1 = " + d1 + "을 갖고 있는 클래스.";
	}
}

public class TreeMapMethod02 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();
		Integer intVal1 = new Integer(20);
		Integer intVal2 = new Integer(10);

		tm1.put(intVal1, "가나다");
		tm1.put(intVal2, "나다라");

		System.out.println(tm1.toString());

		TreeMap<String, Integer> tm2 = new TreeMap<String, Integer>();
		String str1 = "가나";
		String str2 = "다라";

		tm2.put(str1, 10);
		tm2.put(str2, 20);

		System.out.println(tm2.toString());

		TreeMap<MyComparableClass, String> tm3 = new TreeMap<MyComparableClass, String>();
		MyComparableClass mc1 = new MyComparableClass(2, 5);
		MyComparableClass mc2 = new MyComparableClass(3, 3);
		tm3.put(mc1, "가나다");
		tm3.put(mc2, "나라다");
		System.out.println(tm3);

		TreeMap<MyClass, String> tm4 = new TreeMap<MyClass, String>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if (o1.d1 < o2.d1)
					return -1;
				else if (o1.d1 == o2.d1)
					return 0;
				else
					return 1;
			}
		});
		
		MyClass m1 = new MyClass(2, 5);
		MyClass m2 = new MyClass(3, 3);
		tm4.put(m2, "나라다");
		tm4.put(m1, "가나다");
		System.out.println(tm4);
	}
}
