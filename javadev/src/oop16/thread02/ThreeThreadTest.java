package oop16.thread02;

class VideoFileRunnable2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int[] intArray = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

class SMIFileRunnable2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] strArray = { "하나", "둘", "셋", "넷", "다섯" };

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}

		for (int i = 0; i < strArray.length; i++) {
			System.out.println("- (자막 번호) " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreeThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new SMIFileRunnable2());
		Thread t2 = new Thread(new VideoFileRunnable2());
		
		t1.start();
		t2.start();
	}
}
