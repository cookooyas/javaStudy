package basic05.array;

import java.util.Arrays;

public class ReadArrayData {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 3, 4, 5, 6, 7 };
		System.out.println(arr1.length);
		System.out.print(arr1[0] + " ");
		System.out.print(arr1[1] + " ");
		System.out.print(arr1[2] + " ");
		System.out.print(arr1[3] + " ");
		System.out.print(arr1[4] + " ");
		System.out.println();

		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();

		for (int k : arr1) {
			System.out.print(k + " ");
		}
		System.out.println();

		System.out.println(Arrays.toString(arr1));
	}
}
