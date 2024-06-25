package oop19.lambda01;

interface A5{
	void abc();
}

class B5{
	static void bcd() {
		System.out.println("method");
	}
}

public class RefOfStaticMethod {
	public static void main(String[] args) {
		A5 a1 = new A5() {
			@Override
			public void abc() {
				B5.bcd();
			}
		};
		
		A5 a2 = ()->{B5.bcd();};
		
		A5 a3 = B5::bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
		
	}
}
