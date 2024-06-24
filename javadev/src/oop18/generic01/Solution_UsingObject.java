package oop18.generic01;

class Apple1{}
class Pencil1{}

class Goods{
	private Object obj = new Object();
	public Object getObject() {
		return obj;
	}
	public void setObject(Object obj) {
		this.obj = obj;
	}
}

public class Solution_UsingObject {
	public static void main(String[] args) {
		// 이 경우 강제 형변환으로 여러 타입선언이 가능하다만
		// 잘못된 형변환으로 인해 런타임 에러가 발생할 수 있다.
	}
}
