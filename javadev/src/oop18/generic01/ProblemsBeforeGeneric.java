package oop18.generic01;

class Apple{}
class Goods1{
	private Apple apple = new Apple();
	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple = apple;
	}
}


class Pencil{}
class Goods2{
	private Pencil pencil = new Pencil();
	public Pencil getPencil() {
		return pencil ;
	}
	public void setPencil(Pencil pencil ) {
		this.pencil  = pencil ;
	}
}

public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		
		
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());
		Apple apple = goods1.getApple();
		
		
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());
		Pencil pencil = goods2.getPencil();
		
		// 번거로운 작업을 줄일 수 있을 것 같다
		
	}
}
