package basic03.operator;

public class OpTest03 {
	public static void main(String[] args) {
		boolean a, b;
		
		a = true; b=true;
		System.out.println(a && b);
		System.out.println(a || b);

		a = false; b=true;
		System.out.println(a && b);
		System.out.println(a || b);
		
		a = true; b=false;
		System.out.println(a && b);
		System.out.println(a || b);
		
		a = false; b=false;
		System.out.println(a && b);
		System.out.println(a || b);

		a = true; b=false;
		System.out.println(!a);
		System.out.println(!b);
	}
}
