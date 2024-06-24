package oop06.static01;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("김씨","korean");
		Person p2 = new Person("슈씨","russian");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString()); // toString이 오버라이딩 되어있다면 toString()을 쓰지않아도 자동 호출됨
		
		System.out.println("--------------------------------------------");
		
		p1.setName("나카무라씨");
		p1.setNation("japanese");
		
		System.out.println(p1);
	}
}
