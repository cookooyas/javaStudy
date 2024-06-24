package oop01.class02;

import java.util.Arrays;

public class ArrayArgumentMethod {
	public static void main(String[] args) {
		int[] a= new int[] {1,2,3};
		printArray(a);
		printArray(new int[] {1,2,3});
		// printArray({1,2,3}) // 메모리 공간에 할당되지 않은 매개변수는 오류가 발생한다.
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
