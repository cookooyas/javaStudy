package oop01.class02;

public class A2 {
	boolean m1; // default : false
	int m2; // default : 0
	double m3; // default : 0.0
	String m4; // default : null

	void printFieldValue() { // void 뜻 : return 타입이 없다는 뜻이다.
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}

	void printLocalVariable() {
		int k;
//		System.out.println(k); // 지역변수 k는 초기화 하지 않을경우 default가 없기에 오류가 발생한다.
	}
}
