package basic07.method;

import java.util.Arrays;

public class MethodTest02 {
	public static void main(String[] args) {
		print(1);
		print(2,3);
		print(4,5,6);
		
		System.out.println();
		print(3,2,1);
	}
//
//	private static void print(int i, int j, int k) {
//		// TODO Auto-generated method stub
//		System.out.println(i+"\t"+j+"\t"+k);
//		return;
//	}
//
//	private static void print(int i, int j) {
//		// TODO Auto-generated method stub
//		System.out.println(i+"\t"+j);
//		return;
//	}
//
//	private static void print(int i) {
//		// TODO Auto-generated method stub
//		System.out.println(i);
//		return;
//	}

	private static void print(int... i) { // 가변인자 : 메서드가 받는 파라미터의 개수를 모를때 가변인자로 받아들이면 배열로 저장된다.
		// TODO Auto-generated method stub
		for(int k=0;k<i.length;k++) {
			System.out.print(i[k]+"\t");
		}
		System.out.println();
	}
}
