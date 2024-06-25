package oop19.collections03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(3);q1.add(4);q1.add(5);
		System.out.println(q1.element());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		// System.out.println(q1.remove()); // 빈 큐에서 remove를 이용하게 되면 예외 발생
		System.out.println();
		
		Queue<Integer> q2 = new LinkedList<Integer>();
		q2.offer(3);q2.offer(3);q2.offer(3);
		System.out.println(q2.peek());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll()); // 빈 큐에서 poll을 이용하게 되면 예외처리 후 null을 반환
	}
}
