package basic05.array;

public class NonRectangleArray {
	public static void main(String[] args) {
		int[][] arr1=new int[2][];
		arr1[0]=new int[2];
		arr1[0][0]=1;
		arr1[0][1]=2;
		arr1[1]=new int[3];
		arr1[1][0]=3;
		arr1[1][1]=4;
		arr1[1][2]=5;
		
		System.out.println(arr1[0][0]+" "+arr1[0][1]);
		System.out.println(arr1[1][0]+" "+arr1[1][1]+" "+arr1[1][2]);

		
	}
}
