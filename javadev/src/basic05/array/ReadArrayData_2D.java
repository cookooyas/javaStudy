package basic05.array;

public class ReadArrayData_2D {
	public static void main(String[] args) {
		int[][] arr1 = new int[2][3];
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		System.out.println();

		int[][] arr2 = new int[][] { { 1, 2 }, { 3, 4, 5 } };
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		System.out.println();

		System.out.print(arr2[0][0] + " ");
		System.out.print(arr2[0][1] + " ");
		System.out.println();
		System.out.print(arr2[1][0] + " ");
		System.out.print(arr2[1][1] + " ");
		System.out.print(arr2[1][2] + " ");
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		for (int[] array : arr2) {
			for (int k : array) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}
}
