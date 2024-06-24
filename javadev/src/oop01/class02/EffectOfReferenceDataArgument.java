package oop01.class02;

import java.util.Arrays;

public class EffectOfReferenceDataArgument {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};
		modifyData(arr);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(arr));
	}

	private static void modifyData(int[] arr) {
		// TODO Auto-generated method stub
		arr[0]=4;
		arr[1]=5;
		arr[2]=6;
	}
}
