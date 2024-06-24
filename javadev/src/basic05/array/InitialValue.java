package basic05.array;

import java.util.Arrays;

public class InitialValue {
public static void main(String[] args) {
	int v1;
	int[] v2;
	int v3=0;
	int[]v4=null;
	// System.out.println(v1+", "+v2+", "+v3+", "+v4); // stack 메모리에 위치한 변수는 초기화 없이는 출력 불가능
	// v4의 경우 null 로 초기화 되어 있음.
	
	boolean[] arr1=new boolean[3];
	System.out.println(Arrays.toString(arr1));
	
	int[] arr2 = new int[3];
	System.out.println(Arrays.toString(arr2));
	
	double[] arr3=new double[3];
	System.out.println(Arrays.toString(arr3));
	
	String[] arr4=new String[3];
	System.out.println(Arrays.toString(arr4));
}
}
