package basic;

public class A { 	// public 제어자를 없애게 되면 해당 클래스는 비공개 된다.
				// 클래스에 붙을 수 있는 제어자는 public, 빈칸 밖에 없다.
	public int m = 3;
	public int n = 4;

	public void print() {
		System.out.println(m + ", " + n);
	}
}
