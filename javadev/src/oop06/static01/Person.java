package oop06.static01;

public class Person {
	private String name;
	private String nation;
	
	public Person(String name, String nation) {
		super(); // Object 클래스의 생성자를 호출하는 영역 (생략가능, 컴파일 단계에서 자동수행)
		this.name = name;
		this.nation = nation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", nation=" + nation + "]";
	}
	
	
}
