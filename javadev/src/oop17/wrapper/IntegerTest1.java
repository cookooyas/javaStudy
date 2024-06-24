package oop17.wrapper;

public class IntegerTest1 {
	public static void main(StringTest[] args) {
		Integer i = 10; // 원래라면 Integer i = Ingeger.valueOf(10); 이 맞지만, 허용된다.
		System.out.println(i); // 원래라면 System.out.println(i.intValue()); 였어야 하지만, 이를 지원해준다.

		int n = i; // 오토 언박싱(auto unboxing)
		
	}
}
