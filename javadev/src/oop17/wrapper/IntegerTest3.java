package oop17.wrapper;

public class IntegerTest3 {
	public static void main(StringTest[] args) {
		Integer a1 = Integer.valueOf(127);
		Integer a2 = Integer.valueOf(127);
		System.out.println(a1==a2); // 주소 값이 같아서 같다.
		
		Integer b1 = Integer.valueOf(128);
		Integer b2 = Integer.valueOf(128);
		System.out.println(b1==b2); 
		// 자바는 정수값 중 -128~127 사이의 영역은 자주 쓰이는 영역으로 판단해 
		// Integer 클래스가 메소드 영역에 올라갈 때, 해당 값을 미리 할당해둔다.
		// 따라서 128의 값부터는 힙영역에 추가하게 됨으로 해당 참조값부터는 다르다.
		// 결국 두 값이 같은지 비교하려면 다음과 같이 작성한다.
		
		System.out.println(b1.equals(b2));
	}
}
