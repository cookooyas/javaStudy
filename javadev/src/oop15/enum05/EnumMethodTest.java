package oop15.enum05;

import oop15.enum04.Week;

public class EnumMethodTest {
	public static void main(String[] args) {
		//1. name 메서드 : 열거형 객체가 가지고 있는 문자열을 리턴
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//2. ordinal 메서드 : 전체 열거 객체 중에서 몇 번째 열거 객체인지 알려주는 메서드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//3. compareTo 메서드 : 매개변수가 주어진 열거 객체를 기준으로 몇 번째 위치에 있는지 알려주는 메서드
		Week day1= Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		System.out.println(result1);
		
		int result2 = day2.compareTo(day1);
		System.out.println(result2);
		
		//4. values 메서드 : 열거 타입의 모든 객체들을 배열로 만들어 리턴. 배열의 인덱스는 열거 객체의 순번과 같다.
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
		
	}
}
