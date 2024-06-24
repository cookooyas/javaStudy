package oop05.modifier01;
public class AccessModifierOfClass {
	public static void main(String[] args) {
		AA aa =new AA();
		BB bb = new BB();
		CC cc = new CC();
		// 같은 패키지 내에서 public, default 타입의 클래스를 임포트할 수 있고 public, default 생성자 또한 모두 호출이 가능하다.
		// oop04.test의 AccessModifierOfClass를 확인해보자.
	}
}
