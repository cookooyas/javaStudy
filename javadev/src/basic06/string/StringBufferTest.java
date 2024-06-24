package basic06.string;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // string 객체의 단점을 보완해주는 클래스
		printString(sb);
		
		sb.append("실수란 ");
		printString(sb);
		
		sb.append("신을 용서하는 ");
		printString(sb);
		
		sb.append("인간의 행위이다.");
		printString(sb);
		
		sb.insert(16, "자비로운 ");
		printString(sb);
		
		sb.delete(16, 21); // 21번째 인덱스는 삭제 안됨 16~20번째 인덱스 요소가 삭제됨
		printString(sb);

		sb.reverse();
		printString(sb);
		
		sb.reverse();
		printString(sb);
	}

	private static void printString(StringBuffer sb) {
		// TODO Auto-generated method stub
		System.out.println(sb.length()+" : "+sb.capacity());
		System.out.println(sb);
	}
}
