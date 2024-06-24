package oop16.thread01;

public class ThreadTest {
	public static void main(String[] args) {
		Thread videoFileThread = new VideoFileThread();
		videoFileThread.start();
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
