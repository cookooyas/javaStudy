package oop12.garbage;

public class ReferenceTest {
	public static void main(String[] args) {
		RefMe r1 = new RefMe();
		RefMe r2 = r1;
		r1=null;
		System.gc(); // 강제로 가비지 컬렉션 요청 => 아직 r2가 힘영역의 RefMe 객체를 참조하고 있음
		r2=null;
		System.gc(); // 강제로 가비지 컬렉션 요청 => r2를 지워버림으로써 완전히 필요없어진 객체를 gc가 제거함
		
		System.out.println("종료");
	}
}
