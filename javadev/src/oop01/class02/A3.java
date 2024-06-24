package oop01.class02;

public class A3 {
	void print() {
		System.out.println("hi");
	}
	
	int data() {
		return 3;
	}
	
	double sum(int a, double b) {
		return a+b;
	}
	
	void printMonth(int m) {
		if(m<=0||m>12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m+"월 입니다.");
	}
}
