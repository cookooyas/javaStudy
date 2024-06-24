package oop17.wrapper;

public class StringTest {
	public static void main(String[] args) {

		String s1 = new String("어쩌구 저쩌구");
		String s2 = new String("어쩌구 저쩌구");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		// 분명 s1, s2의 해쉬코드는 같게 나온다.
		// 즉, 같은 메모리 주소를 공유하는 것 같아보인다.
		// 하지만, s1==s2를 확인해보면 이미 다르다는 것을 알 수 있다.
		// 즉, 다른 객체임을 알 수 있다.
		// 이는 일부 래퍼클래스의 특징 중 하나로
		// 해시코드 값이 같다고해서 같은 객체는 아니다.
		s2 += "!!";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
	}
}
