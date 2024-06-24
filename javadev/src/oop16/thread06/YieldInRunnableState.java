package oop16.thread06;

class MyThread extends Thread {
	boolean yieldFlag;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (yieldFlag) {
				Thread.yield(); // yiedlflag가 true라면, cpu 사용권 양보
			} else {
				System.out.println(getName() + " 실행");
//				for (long i = 0; i < 10; i++) {
//
//				}
			}
		}
	}
}

public class YieldInRunnableState {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("t1");
		t1.yieldFlag=false;
		t1.setDaemon(true);
		t1.start();
		
		
		MyThread t2 = new MyThread();
		t2.setName("t2");
		t2.yieldFlag=true;
		t2.setDaemon(true);
		t2.start();
		
		for(int i =0; i<6;i++) {
			try {Thread.sleep(1000);
			}catch(InterruptedException e) {}
			t1.yieldFlag=!t1.yieldFlag;
			t2.yieldFlag=!t2.yieldFlag;
		}
	}
}
