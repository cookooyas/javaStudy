package oop19.collections03;

import java.util.Stack;

public class StackMethod {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(2);
		s.push(5);
		s.push(3);
		s.push(7);
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println();
		// search의 인덱스는 가장 상위의 (먼저 나가는) 위치에서 순서대로 부여된다.
		System.out.println(s.search(7));
		System.out.println(s.search(3));
		System.out.println(s.search(5));
		System.out.println(s.search(2));
		System.out.println(s.search(9)); // 존재하지 않는 값을 search하면 -1 리턴
		System.out.println();
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println();
		System.out.println(s.empty());
	}
}
