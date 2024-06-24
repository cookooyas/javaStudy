package oop15.enum03;

public class EnumTest {
	public static void main(String[] args) {
		whoAreYou(Person.MAN);
//		whoAreYou(Animal.CAT); // enum을 이용하면 다른 타입의 같은 순서도 다른 값으로 인식한다.
	}
	private static void whoAreYou(Person man) {
		// TODO Auto-generated method stub
		switch(man) {
		case MAN:
			System.out.println("남자");
			break;
		case WOMAN:
			System.out.println("여자");
			break;
		case BABY:
			System.out.println("응애");
			break;
		}
	}
}
