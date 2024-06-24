package oop15.enum02;

import oop15.enum01.Animal;
import oop15.enum01.Person;

public class EnumTest {
	public static void main(String[] args) {
		Person man = Person.WOMAN;
		if (man == Person.MAN)
			System.out.println("man");
		else if (man == Person.WOMAN)
			System.out.println("woman");
		else
			System.out.println("baby");

//		if (man == Animal.CAT) {
//			System.out.println("야옹");
//		} else {
//			System.err.println("하이");
//		}
	}
}
