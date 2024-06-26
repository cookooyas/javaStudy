package oop20.reflection;

import java.lang.reflect.InvocationTargetException;

public class ReflectionTest4 {
	public static void main(String[] args) {
		Worker w1 = new Worker("서태웅", Worker.POSITION_ASSISTANT);

		Class<?> cls = w1.getClass();

		try {
			Object obj = cls.getConstructor().newInstance();// 새로운 객체를 얻어온다. 신 문법

			if (obj instanceof Worker) {
				System.out.println("Worker 클래스의 인스턴스입니다.");
			}
			System.out.println("worker.hashCode : " + w1.hashCode());
			System.out.println("obj.hashCode : " + obj.hashCode()); // 새로운 객체가 되었다

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
