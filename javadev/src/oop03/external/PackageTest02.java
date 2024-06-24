package oop03.external;

import basic.A;
import basic.test.*;// car 클래스는 basic.test패키지 내부에있고 해당 패키지는 basic 내부에 있다. 
import basic.*;// 이 때, basic.*을 임포트한다 했을 때, basic.test패키지 내부에 있는 클래스는 임포트 되지 않는다.

public class PackageTest02 {
	public static void main(String[] args) {
		A a = new A(); // 임포트 문을 이용해 클래스를 사용하는 방법

		System.out.println(a.m);
		System.out.println(a.n);
		a.print();

		Car car = new Car();
		car.drive();
	}
}
