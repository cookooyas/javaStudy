package oop19.lambda01;

interface AA2{
	int abc(String str);
}

public class RefOfInstanceMethod_Type2_2 {
	public static void main(String[] args) {
		AA2 a = String::length;
		System.out.println(a.abc("안녕하십니까. 반가워요."));
	}
}
