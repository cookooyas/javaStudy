package basic07.method;

public class MethodTest01 {
	public static void main(String[] args) {
		print();
		print();
		print();
		print("son");
		print("lee");

		int a = 7, b = 4;
		System.out.println(a+"+"+b+"="+add(a,b));
		System.out.println(a+"-"+b+"="+sub(a,b));
		System.out.println(a+"*"+b+"="+mul(a,b));
		System.out.println(a+"/"+b+"="+div(a,b));
		System.out.println(a+"%"+b+"="+mod(a,b));
	}

	private static int mod(int a, int b) {
		// TODO Auto-generated method stub
		return a%b;
	}

	private static int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	private static int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	private static int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	// 메소드 이름은 같고 매개변수의 개수, 타입이 다른 여러 경우에 대해 여러번 작성해서 명시할 수 있다.
	// 이를 메소드 오버로딩이라고 한다.
	private static void print(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello " + name + "!");
		return;
	}

	private static void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		return;
	}
}
