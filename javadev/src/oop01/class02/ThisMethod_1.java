package oop01.class02;
class A7{
	A7(){
		System.out.println("1st");
	}
	A7(int x){
		this();
		System.out.println("2nd");
	}
//	void abc() {
//		this(); // 메서드 내에서는 this() 사용 불가능
//	}
}
public class ThisMethod_1 {
	public static void main(String[] args) {
		A7 a1 = new A7();
		System.out.println();
		A7 a2 = new A7(3);
		System.out.println();
	}
}
