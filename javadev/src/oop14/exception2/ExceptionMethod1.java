package oop14.exception2;

public class ExceptionMethod1 {
	public static void main(String[] args) {
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			throw new Exception("hi");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
