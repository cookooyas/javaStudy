package basic04.control;

public class IfTest01 {
	public static void main(String[] args) {
		int n = 2;
		if (n == 1) {
			System.out.println("남자");
		} // if 조건문 내부의 코드가 한문장일때는 중괄호 생략이 가능하긴 하다.
		else if(n==2) {
			System.out.println("여자");
		}else {
			System.out.println("알수없음.");
		}
		System.out.println("종료");
	}
}
