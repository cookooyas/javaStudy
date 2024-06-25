package oop19.lambda01;

interface A4 {
	void abc(int k);
}

public class RefOfInstanceMethod_Type1_2 {
	public static void main(String[] args) {
		A4 a1 = new A4() {
			@Override
			public void abc(int k) {
				System.out.println(k);
			}
		};

		A4 a2 = (int k) -> {
			System.out.println(k);
		};
		A4 a3 = System.out::println;
		
		a1.abc(1);
		a2.abc(2);
		a3.abc(3);
	}
}
