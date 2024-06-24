package basic05.array;

public class ArrayTest01 {
	public static void main(String[] args) {
		int[] arr = new int[3];	// stack 영역에 메모리 주소가 할당된다. heap에 배열요소가 배열객체로 저장된다.
								// 여기서 3은 담을수 있는 공간의 수를 의미한다.
								// 배열객체는 기본적으로 배열의 길이를 의미하는 length를 보유하고있다.
								// 타입에 따라 저장되는 기본 값이 다르다
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		for (int i=0;i<3;i++) {
			System.out.println(arr[i]);
		}
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
//		
//		아래 코드는 코드상에서 문제가 없지만 컴파일 후 실행시 오류가 발생한다. 즉 "실행예외"이다.
//		for (int i=0;i<=arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		int[] arr2=new int[] {300,200,100}; //이처럼 바로 선언해줄 수 있다. (표현방법 2)
		for (int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr3= {1,2,3}; //이런방식으로 new 연산자 없이 바로 배열을 정의할 수 있다. (표현방법 3)
		for (int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
	}
}
