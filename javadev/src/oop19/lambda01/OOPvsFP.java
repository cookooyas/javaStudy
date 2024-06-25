package oop19.lambda01;

@FunctionalInterface
interface A{
	void abc();
//	void bcd(); 	// 두개이상의 함수를 가진 인터페이스는 함수형 인터페이스라고 할 수 없다.
					// 이러한 정의를 유지하기 위해 @FunctionalInterface 어노테이션을 이용한다.
}

class B implements A{
	@Override
	public void abc() {
		System.out.println("method1");
	}
}

public class OOPvsFP {
	public static void main(String[] args) {
		// case 1 : 객체지향 프로그래밍 문법
		A a1 = new B();
		a1.abc();
		
		// case 2 : 객체지향 프로그래밍 문법2
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("method2");
			}
		};
		a2.abc();
		
		// case 3 : 함수형 프로그래밍 문법(람다식)
		A a3 = ()->{System.out.println("method3");};
		a3.abc();
	}
}
