package oop16.thread06;

class MyThread2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(300000);
		}catch(InterruptedException e) {
			System.out.println("-- sleep() 진행중 interupt() 발생 --");
			for(long i =0; i<1000000000000000000l;i++) {}
		}
	}
	
}

public class TimedWaiting_sleep {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		t1.start();
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		System.out.println("t1 STATE = "+t1.getState());
		
		// TIMED_WAITING
		t1.interrupt();
		try {Thread.sleep(1000);}catch(InterruptedException e){}
		System.out.println("t1 STATE = "+t1.getState());
	}
}
