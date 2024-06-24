package basic05.array;

import java.util.Arrays;

public class ArrayTest03 {
	public static void main(String[] args) {
		// 3차원 배열
		int[][][] score = { { { 100, 90, 80, 70 }, { 90, 80, 70, 60 }, { 80, 70, 60, 50 } },
				{ { 100, 100, 90, 80 }, { 100, 90, 80, 70 }, { 90, 80, 70, 60 } } };
		int sum;
		double avg;
		// 3차원 배열의 길이(length) : 포함된 2차원 배열 개수
		System.out.println(score.length);
		System.out.println();

		// 반복문을 이용한 요소 조회
		// 3중 for 문을 이용해 상위 : 탭 / 중위 : 행 / 하위 :열
		
		for (int tab = 0; tab < score.length; tab++) {
			System.out.println("\t\t["+(tab+1)+"학기 성적표]");
			System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
			System.out.println("=============================================");
			for (int r = 0; r < score[tab].length; r++) {
				sum = 0;
				avg = 0.0;
				for (int c = 0; c < score[tab][r].length; c++) {
					System.out.print(score[tab][r][c] + "\t"); // \t 를 이용하면 줄맞춤에 용이함
					sum += score[tab][r][c];
				}
				avg = sum / score[tab][r].length;
				System.out.print(sum + "\t");
				System.out.print(avg);
				System.out.println();
			}
			System.out.println("=============================================");
			System.out.println();
		}
		
		int[][] a= {{1,2,3},{4,5,6}};
		System.out.print(Arrays.toString(a[0]));
		System.out.print(Arrays.toString(a[1]));
		System.out.println();
		a[1]=a[0];
		System.out.print(Arrays.toString(a[0]));
		System.out.print(Arrays.toString(a[1]));
		System.out.println();
		a[0][1]=4;
		System.out.print(Arrays.toString(a[0]));
		System.out.print(Arrays.toString(a[1]));
		System.out.println();
	}
}
