package oop13.exception1;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			System.out.println(3 / 0);
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("end");
		}

		try {
			int num = Integer.parseInt("10A");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		} finally {
			System.out.println("end");
		}

		try {
			System.out.println(3 / 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 못나눔");
		} catch (NumberFormatException e) {//다중 트라이캐치에서 입력받은 예외에 대해서, Exception타입으로 선언해버리면, 이후의 catch문은 에러가 발생
			System.out.println("숫자로 못바꿈");
		} finally {
			System.out.println("end");
		}
	}
}
