package oop20.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest2 {
	public static void main(String[] args) {
		Class<?> cls = Worker.class;

		// Constructor -> java.lang.reflect
		Constructor<?>[] constructors = cls.getDeclaredConstructors();
		for (int i = 0; i < constructors.length; i++) {
			System.out.println("생성자"+(i+1)+" : "+constructors[i].toString());
		}
		System.out.println();
		
		// Constructor -> java.lang.reflect
		Method[] methods = cls.getDeclaredMethods();// getMethod가 아님!
		for (int i = 0; i < methods.length; i++) {
			System.out.println("메서드"+(i+1)+" : "+methods[i].toString());
		}
		System.out.println();
		
		// Field -> java.lang.reflect
		Field[] fields = cls.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println("필드"+(i+1)+" : "+fields[i].toString());
		}
		System.out.println();
	}
}
