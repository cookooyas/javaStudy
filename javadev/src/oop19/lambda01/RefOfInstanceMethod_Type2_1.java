package oop19.lambda01;

interface AA{
	void abc(BB b , int k);
}

class BB{
	void bcd(int k) {
		System.out.println(k);
	}
}

public class RefOfInstanceMethod_Type2_1 {
	public static void main(String[] args) {
		AA aa = BB::bcd;
		aa.abc(new BB(), 1);
	}
}
