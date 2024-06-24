package basic03.operator;

public class OpTest10 {
	public static void main(String[] args) {
		double d = 10;// 자동형변환(업캐스팅
		System.out.println(d);

		// int i =3.141592; 해당 코드는 적용될 수 없다.
		int i = (int) 3.141592; // 이렇게 강제형변환을 할 수 있지만, 소수점 이하의 자리는 버림된다.
		System.out.println(i);

		System.out.println(Math.random()); // Math 클래스의 random()을 호출하면 0.0이상, 1.0미만의 임의의 실수를 리턴한다.
		
		// 만약 주사위를 만든다면?
		System.out.println((int)(Math.random()*6)+1); // 랜덤 실수 * 6을 한 후, 강제 형변환하여 0~5의 값에서 +1해서 출력한다.
	}
}
