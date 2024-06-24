package oop14.exception2;

class MinusException extends Exception{
	public MinusException() {
		super();
	}
	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception{
	public OverException() {
		super();
	}
	public OverException(String msg) {
		super(msg);
	}
}

class A5 {
	void checkScore(int score) throws MinusException, OverException {
		if(score<0) {
			throw new MinusException("예외발생: 음수값 입력");
		}
		else if (score >100) throw new OverException("예외발생: 100점 초과");
		else System.out.println("정상 범위 값");
	}
}

public class UserExceptionExample {
	public static void main(String[] args) {
		A5 a = new A5();
		try {
//			a.checkScore(-10); //예외발생: 음수값 입력
			a.checkScore(100); //정상 범위 값
			a.checkScore(101); //예외발생: 100점 초과
		}catch(MinusException|OverException e) {
			System.out.println(e.getMessage());
		}
	}
}
