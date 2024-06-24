package oop19.collections01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest01 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();

		// add()
		l1.add(3);
		l1.add(4);
		l1.add(5);
		System.out.println(l1);

		// add(int index, E element)
		l1.add(1, 6);
		System.out.println(l1);

		// addAll()
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.addAll(l1);
		System.out.println(l2);

		// addAll(int index, List객체)
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(1);
		l3.add(2);
		l3.addAll(1, l3);
		System.out.println(l3);

		// set(int index, E element)
		l3.set(1, 5);
		l3.set(3, 6);
//		l3.set(4, 7); // 배열초과, 실행오류 발생
		l3.addAll(1, l3);
		System.out.println(l3);

		// remove(int index)
		l3.remove(1);
		System.out.println(l3);

		// remove(Object o)
//		l3.remove(new Integer(2)); // deprecate
		l3.remove(Integer.valueOf(2));
		System.out.println(l3); // 선언된 2 중 배열에서 가장 우선순위의 요소 2 가 사라짐

		// clear()
		l3.clear();
		System.out.println(l3);

		// isEmpty()
		System.out.println(l3.isEmpty());

		// size()
		System.out.println(l3.size());

		// get(int index)
		l3.add(1);
		l3.add(9);
		l3.add(3);
		System.out.println(l3.get(0));
		System.out.println(l3.get(1));
		System.out.println(l3.get(2));

		// 각 요소를 순차적으로 얻는 방법
		for (int i = 0; i < l3.size(); i++)
			System.out.println(l3.get(i));

		// 배열로 변환
		Object[] obj = l3.toArray();
		System.out.println(Arrays.toString(obj));

		// 현재 리스트 배열보다 작은 값을 new Integer[n]의 n에 입력하면
		// 현재 리스트의 값을 포함하는 배열로 반환한다.
		Integer[] int1 = l3.toArray(new Integer[0]);
		Integer[] int2 = l3.toArray(new Integer[1]);
		Integer[] int3 = l3.toArray(new Integer[2]);
		System.out.println(Arrays.toString(int1) + "|" + Arrays.toString(int2) + "|" + Arrays.toString(int3));

		// 동기화 (Vector의 기능을 유사하게 구현가능)
		List<String> l4 = Collections.synchronizedList(new ArrayList<String>());
		l4.add("가");
		l4.add("나");
		l4.add("다");

		System.out.println(l4);
	}
}
