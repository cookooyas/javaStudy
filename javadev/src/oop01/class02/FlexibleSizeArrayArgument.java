package oop01.class02;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		// method1
		method1(1, 2);
		method1(1, 2, 3);
		method1();

		// method2
		method2("hi", "hello");
		method2("thank you", "very", "much");
		method2();
	}

	private static void method1(int... arr) {
		// TODO Auto-generated method stub
		System.out.println("배열의 길이 : " + arr.length);
		// case 1. for1
		System.out.println("for1");
		for (int i : arr)
			System.out.print(i);
		System.out.println();

		// case 2. for2
		System.out.println("for2");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

		// case 3. Arrays.toString()
		System.out.println("Arrays.toString()");
		System.out.println(Arrays.toString(arr));
	}

	private static void method2(String... arr) {
		// TODO Auto-generated method stub
		System.out.println("배열의 길이 : " + arr.length);
		// case 1. for1
		System.out.println("for1");
		for (String k : arr)
			System.out.print(k + " ");
		System.out.println();

		// case 2. for2
		System.out.println("for2");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		// case 3. Arrays.toString()
		System.out.println("Arrays.toString");
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}

}
