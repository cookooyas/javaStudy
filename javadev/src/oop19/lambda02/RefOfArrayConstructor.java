package oop19.lambda02;

interface A{
	int[] abc(int len);
}

public class RefOfArrayConstructor {
	public static void main(String[] args) {
		A a1 = new A() {
			@Override
			public int[] abc(int len) {
				return new int[len];
			}
		};
		
		A a2 = (int len)->{
			return new int[len];
		};
		
		A a3 = int[]::new;
		
		System.out.println(a1.abc(10).length);
		System.out.println(a2.abc(20).length);
		System.out.println(a3.abc(30).length);
	}
}
