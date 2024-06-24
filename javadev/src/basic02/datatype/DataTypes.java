package basic02.datatype;

public class DataTypes {
	public static void main(String[] args) {
		boolean b1 = false;
		System.out.println("b1 : " + b1);

		char c1 = 'A'; // 홑따옴표를 이용해 표현한다
		System.out.println("c1 : " + c1);
		char c2 = 65; // 유니코드에서 1대1 대응되는 값의 문자를 표현한다
		System.out.println("c2 : " + c2);

		byte b2 = 127;
		System.out.println("b2 : " + b2);

		short s = 32767;
		System.out.println("s : " + s);
		// 127과 같은 값을 리터럴이라고 한다.
		// 기본적으로 해당 값은 int(4바이트)로 받지만, 값이 byte, short타입의 표현범위 이내면 자동으로 변환해준다.

		int i = 2147483647;
		System.out.println("i : " + i);

		long l = 2147483648L;
		// long타입의 리터럴의 경우는 L / l을 붙여줘 int범위가 아닌 long타입 리터럴임을 명시해줘야 한다.
		System.out.println("l : " + l);

		double d = 3.1415926535;
		System.out.println("d : " + d);

		float f = 3.1415926535f;
		System.out.println("f : " + f);
		// long의 경우와 마찬가지로 float이 받을수 있는 4바이트 크기를 받지 못함으로 F / f를 뒤에 붙여 명시해줘야 한다.

		System.out.println("그가 말했다. \"안녕하세요.\"");
		// 만약 문자열("")내부에 쌍따옴표를 포함해 출력하려 한다면 \"를 이용한다.
		// 이를 escape sequence 라고 한다.
		// \n : 엔터(줄바꿈), \t : 탭간격 띄어쓰기,
		System.out.println("안녕하세요\n");
		System.out.println("1\t2\t3\t");

		// 쌍따옴표(")를 3개 준다면, 줄 바꿈까지 포함한 블럭단위의 문자열을 출력한다.
		String str = """
				만반
				잘부
				""";
		System.out.println(str);
	}
}
