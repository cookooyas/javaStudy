package oop11.inner02;

class A2{
	int a=3;
	void abc() {
		int b=5; // 지역변수는 final로 수정될 수 없게 된다.

		// 지역 이너 클래스
		class B{
			void bcd() {
				System.out.println(a);
				//System.out.println(b);

				a=5;
//				b=7; // 지역 이너 클래스에서 사용하는 상위 메서드의 지역 변수는 final로 선언되어 있다.
			}
		}
		B bb=new B();
		bb.bcd();
		b=7;
	}
	
}

public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A2 a = new A2();
		a.abc();
	}
}
