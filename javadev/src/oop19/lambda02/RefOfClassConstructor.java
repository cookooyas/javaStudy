package oop19.lambda02;

interface A1{
	B1 abc();
}

interface A2{
	B1 abc(int k);
}

class B1{
	B1(){
		System.out.println("first constructor");
	}
	B1(int k){
		System.out.println("second constructor");
	}
}


public class RefOfClassConstructor {
	public static void main(String[] args) {
		A1 a1 = new A1() {
			@Override
			public B1 abc() {
				return new B1();
			}
		};
		
		A1 a2 = ()->new B1();
		
		A1 a3 = B1::new;

		a1.abc();
		a2.abc();
		a3.abc();
		
		System.out.println();
		
		A2 a21 = new A2() {
			@Override
			public B1 abc(int k) {
				return new B1(k);
			}
		};
		
		A2 a22 = (int k )->new B1(k);
		
		A2 a23 = B1::new;

		a21.abc(3);
		a22.abc(3);
		a23.abc(3);
	}
}
