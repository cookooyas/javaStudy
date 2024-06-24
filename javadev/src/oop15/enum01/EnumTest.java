package oop15.enum01;

public class EnumTest {
	public static void main(String[] args) {
		whoAreYou(Person.MAN); // MAN : 1
		whoAreYou(Animal.DOG); // DOG : 1 -> 아래의 코드에 따르면 타입 구분이 어렵ㅇ
		
		int myFriend = Person.WOMAN;
		if (myFriend == Animal.CAT) {
			System.out.println("야옹");
		}else {
			System.err.println("하이");
		}
	}

	private static void whoAreYou(int man) {
		// TODO Auto-generated method stub
		switch(man) {
		case Person.MAN:
			System.out.println("남자");
			break;
		case Person.WOMAN:
			System.out.println("여자");
			break;
		case Person.BABY:
			System.out.println("응애");
			break;
		}
	}
}
