package basic02.datatype;

public class NamingVariableAndConstant {
	public static void main(String[] args) {
		// 변수
		boolean aBcD;
		byte 가나다;		//한글 이용가능. 권장 x
		short _abcd;
		char $ab_cd;
		//	long 3abcd;		//숫자는 변수의 첫글자로는 사용불가
		long abcd;
		//	float int;		// 예약어 사용불가
		double main;
		//	int my Work;	// 스페이스 바, 특수 키 사용불가
		String myClassName;
		int ABC;			// 전부 대문자로 작성. 권장 x

		// 상수
		final double PI;
		final int MY_DATA;
		final float myData;	// 소문자 사용. 권장 x
	}
}
