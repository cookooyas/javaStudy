package oop20.reflection;

public class Worker {
	// final
	public static final int POSITION_MANAGER=0;
	public static final int POSITION_ASSISTANT=1;
	public static final int POSITION_EMPLOYEE=2;
	
	// variables
	private String name;
	private int position;
	
	//constructor
	public Worker() {
		name = null; // 없어도 무관
		position = Integer.MAX_VALUE;
	}
	//constructor overloading
	public Worker(String name, int position) {
//		super();
		this.name = name;
		this.position = position;
	}



	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	//toString Overriding
	@Override
	public String toString() {
		return "Worker [name=" + name + ", position=" + position + "]";
	}
	
	
	
}
