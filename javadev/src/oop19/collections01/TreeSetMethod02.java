package oop19.collections01;

import java.util.Comparator;
import java.util.TreeSet;

class MyClass {
	int d1;
	int d2;

	public MyClass(int d1, int d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
}

class MyComparableClass implements Comparable<MyComparableClass> {
	int d1;
	int d2;

	public MyComparableClass(int d1, int d2) {
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
}

public class TreeSetMethod02 {
	public static void main(String[] args) {
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(20);
		ts1.add(10);
		System.out.println(ts1.toString());

		TreeSet<String> ts2 = new TreeSet<String>();
		String s1 = "가나";
		String s2 = "다라";
		ts2.add(s1);
		ts2.add(s2);
		System.out.println(ts2.toString());

		TreeSet<MyComparableClass> ts3 = new TreeSet<MyComparableClass>();
		MyComparableClass mc1 = new MyComparableClass(2, 5);
		MyComparableClass mc2 = new MyComparableClass(3, 3);

		ts3.add(mc1);
		ts3.add(mc2);

		for (MyComparableClass mc : ts3) {
			System.out.println(mc.d1);
		}

		TreeSet<MyClass> ts4 = new TreeSet<MyClass>(new Comparator<MyClass>() {
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
		ts4.add(m1);
		ts4.add(m2);
		for (MyClass m : ts4) {
			System.out.println(m.d1); //순차적으로 d1만 출력
		}
	}
}
