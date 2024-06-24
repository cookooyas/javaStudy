package oop13.exception1;

public class MultiCatch2 {
	public static void main(String[] args) {
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("1!");
		} catch (NumberFormatException e) {// 다중 트라이캐치에서 입력받은 예외에 대해서, Exception타입으로 선언해버리면, 이후의 catch문은 에러가 발생
			System.out.println("숫자로 못바꿈");
		} catch (Exception e) { // 마지막 catch문에서 예외처리를 하지못한 예외에 대해서 일괄적으로 처리하게 끔하면 된다.
			System.out.println("0으로 못나눔");
		} finally {
			System.out.println("end");
		}
	}
}
