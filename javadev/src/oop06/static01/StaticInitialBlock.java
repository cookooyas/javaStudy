package oop06.static01;
class AAA{
	int a;
	static int b;
	static {
		b=5;
		System.out.println("클래스 A가 로딩됐습니다.");
	}
	AAA(){
		a=3;
	}
}
public class StaticInitialBlock {
	public static void main(String[] args) {
		System.out.println(AAA.b);
	}
}
