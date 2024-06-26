package oop20.reflection;

public class ReflectionTest1 {
	public static void main(String[] args) {
		Worker w1 = new Worker("정대만", Worker.POSITION_EMPLOYEE); // 일반적인 워커 객체 생성

		@SuppressWarnings("rawtypes")
		Class cls1 = w1.getClass(); // getClass 함수 해당 Class타입 반환

		@SuppressWarnings("rawtypes")
		Class cls2 = Worker.class; // 정해진 키워드 Class타입 반환

		@SuppressWarnings("rawtypes") // 제네릭 처리 요구 (노란 밑줄) 제거 보기 싫으면 Class<?>를 이용해 제네릭에 오브젝트 클래스 삽입
		Class cls3 = null;
		try {
			cls3 = Class.forName("oop20.reflection.Worker"); // Exception
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("w1 hash code : " + w1.hashCode());
		System.out.println("cls1 hash code : " + cls1.hashCode());
		System.out.println("cls2 hash code : " + cls2.hashCode());
		System.out.println("cls3 hash code : " + cls3.hashCode());
	}
}
