package oop16.thread05;

public class SyncTest1 {
	public static void main(String[] args) {
		MyData myData = new MyData();
		
		// PlusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("플러스 쓰레드 1");
		plusThread1.start();
		
		try {Thread.sleep(1000);}catch(InterruptedException e){}
		
		// Plus Thread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("플러스 쓰레드 2");
		plusThread2.start();
		
		try {Thread.sleep(1500);}catch(InterruptedException e){}
		System.out.println(myData.data);
		
		try {Thread.sleep(2000);}catch(InterruptedException e){}
		System.out.println(myData.data);
		
	}
}
