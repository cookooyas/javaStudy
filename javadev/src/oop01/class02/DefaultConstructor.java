package oop01.class02;

class Aa {
	int m;

	void work() {
		System.out.println(m);
	}
}

class Bb {
	int m;

	void work() {
		System.out.println(m);
	}

	Bb() {

	}
}

class Cc{
	int m;
	void work() {
		System.out.println(m);
	}
	Cc(int a){
		m=a;
	}
}

public class DefaultConstructor{
	public static void main(String[] args) {
		Aa a=new Aa();
		Bb b=new Bb();
//		Cc c=new Cc(); // 기본생성자 호출 불가능
		Cc c=new Cc(3);
		a.work();
		b.work();
		c.work();
	}
}