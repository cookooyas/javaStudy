package oop11.inner03;

class A6{
	interface B6{
		public abstract void bcd();
	}
}

class C6 implements A6.B6{
	public void bcd() {
		System.out.println("이너 인터페이스로 구현 클래스 생성");
	}
}

public class CreateObjectOfInnerInterface {
	public static void main(String[] args) {
		A6.B6 ab = new C6();
		C6 c = new C6();
		c.bcd();
		
		A6.B6 b=new A6.B6() {
			public void bcd() {
				System.out.println("익명 이너클래스로 객체생성");
			}
		};
		b.bcd();
	}
}
