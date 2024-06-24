package oop16.thread01;

class SMIFileThread extends Thread {// 자막 번호 담당 쓰레드

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

public class CreateAndStartThread {
	public static void main(String[] args) {
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start(); // start 메서드를 통해 새롭게 정의된 SMIFileThread 클래스를 실행한다.

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
