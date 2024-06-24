package practice;

public class C3Q6 {
	public static void main(String[] args) {
		System.out.println(false && true); // false
		System.out.println((4 <= 4) || (6 < 3)); // 4<=<4 : true -> 쇼트서킷
		System.out.println(false ^ (3 >= 4)); // 3>=4 : false -> false ^ false : false
		System.out.println(!(3 <= 3)); // 3<=3 : true -> false
	}
}
