package oop16.thread03;

public class ThreadProperties1 {
	public static void main(String[] args) {
		Thread curThread = Thread.currentThread();
		System.out.println(curThread.getName());
		System.out.println(Thread.activeCount());
		
		for(int i = 0;i<3;i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		for(int i =0; i<3;i++) {
			Thread thread =new Thread();
			thread.setName(i+"번째 스레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		for(int i =0; i<3;i++) {
			Thread thread =new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println(Thread.activeCount()); // 해당 명령이 실행될 당시 활성되어 있는 스레드 수.
		
		System.out.println();
	}
}
