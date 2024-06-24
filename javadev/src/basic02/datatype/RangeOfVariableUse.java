package basic02.datatype;

public class RangeOfVariableUse {
	public static void main(String[] args) {
		int value1 = 3; // 해당 시점에서 value1이 메모리에 할당된다.
		{
			int value2 = 5; // 해당 시점에서 value2가 메모리에 할당된다.
			System.out.println(value1);
			System.out.println(value2);
		} // 중괄호가 사라지는 시점에서 value2는 메모리에서 해제된다.
		System.out.println(value1);
	} // 해당 시점에서 value1은 메모리에서 해제된다.
}
