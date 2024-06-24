package oop16.thread06;

class MyThread3 extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 1000000000000000000l; i++) {
		}
	}
}

class MyThread4 extends Thread {
	MyThread3 myThread3;

	public MyThread4(MyThread3 myThread3) {
		this.myThread3 = myThread3;
	}

	@Override
	public void run() {
		try {
			myThread3.join(3000);
		} catch (InterruptedException e) {
			System.out.println("-- join(..) 진행 중 interrupt 발생 --");
			for (long i = 0; i < 100000000000000000l; i++) {
			}
		}
	}
}

public class TimedWaiting_Join {
	public static void main(String[] args) {
		MyThread3 t1 = new MyThread3();
		MyThread4 t2 = new MyThread4(t1);
		t1.start();
		t2.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		System.out.println("t1.getState : "+t1.getState());

		System.out.println("t2.getState : "+t2.getState());

		t2.interrupt();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		
		System.out.println("t1.getState : "+t1.getState());

		System.out.println("t2.getState : "+t2.getState());
	}
}
