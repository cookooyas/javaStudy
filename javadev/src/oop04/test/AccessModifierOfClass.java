package oop04.test;

import oop05.modifier01.AA;
//import oop05.modifier01.BB; // default 접근 지정자 클래스이기에 애초에 임포트가 불가능 하다.
import oop05.modifier01.CC;

public class AccessModifierOfClass {
	public static void main(String[] args) {
		AA aa = new AA();
//		BB bb = new BB();
//		CC cc = new CC(); 	// public 접근 지정자 클래스이기에 임포트는 가능하지만, default 생성자이기에,
							// 객체 생성을 위한 호출 (new CC())은 불가능하다.
		// 다른 패키지 내에서는 public 타입의 클래스를 임포트할 수 있고 public 생성자만 호출이 가능하다.

	}
}
