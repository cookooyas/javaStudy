package basic05.array;

public class ArrayTest02 {
	public static void main(String[] args) {
		// 2차원 배열
		int[][] score = { { 100, 90, 80, 70 }, { 90, 80, 70, 60 }, { 80, 70, 60, 50 } };
		int sum;
		double avg;
		// 2차원 배열의 길이(length) : 포함된 1차원 배열 개수
		System.out.println(score.length);
		System.out.println();

		// 반복문을 이용한 요소 조회
		// 2중 for 문을 이용해 상위 : 행 / 하위 :열
		System.out.println("\t\t[성적표]");
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		System.out.println("=============================================");
		for (int r = 0; r < score.length; r++) {
			sum = 0;
			avg = 0.0;
			for (int c = 0; c < score[r].length; c++) {
				System.out.print(score[r][c] + "\t"); // \t를 이용하면 줄맞춤에 용이함
				sum += score[r][c];
			}
			avg = sum / score[r].length;
			System.out.print(sum + "\t");
			System.out.print(avg);
			System.out.println();
		}
		System.out.println("=============================================");
	}
}
