package oop16.thread03;

class MyThread extends Thread{
	@Override
	public void run() {
		for(long i = 0; i<1000000000; i++) {}
			System.out.println(getName()+"의 우선순위 : "+getPriority());
	}
}

public class ThreadProperties2 {
	public static void main(String[] args) {
		System.out.println("코어 수 : "+Runtime.getRuntime().availableProcessors());
		
		for (int i =0; i<3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		
		for (int i = 0; i <10; i++) {
			Thread thread = new MyThread();
			thread.setName(i+"번째 스레드");
			if(i==9) thread.setPriority(10);
			thread.start();
		}
	}
}
