package oop13.exception1;

class A10 implements AutoCloseable {
	String resource;

	A10(String resource) {
		this.resource = resource;
	}

	@Override
	public void close() throws Exception {
		if (resource != null) {
			resource = null;
			System.out.println("리소스 해제됨");
		}
	}
}

public class TryWithResource2 {
	public static void main(String[] args) {
		A10 a1 = null;
		try {
			a1 = new A10("특정파일");
		} catch (Exception e) {
			System.out.println("예외처리");
		} finally {
			if (a1.resource != null) {
				try {
					a1.close();
				} catch (Exception e) {
				}
			}
		}

		try (A10 a2 = new A10("특정파일")) {

		} catch (Exception e) {
			System.out.println("예외처리");
		}
	}
}
