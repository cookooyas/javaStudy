package oop13.exception1;

public class MultiCatch3 {
	public static void main(String[] args) {
		try {
			System.out.println(3 / Integer.parseInt("1!"));
		} catch (NumberFormatException | ArithmeticException e) {// 다중 트라이캐치에서 입력받은 예외에 대해서, Exception타입으로 선언해버리면, 이후의
																	// catch문은 에러가 발생
			System.out.println(e);
			System.out.println("exception occured");
		}
	}
}
