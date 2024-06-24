package oop16.thread05;

public class MyData {
	int data = 3;

	// 방법 1
	public synchronized void plusData() {
		int getData = data;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		data = getData + 1;
	}
	
	public void plusData2() {
		//현재 코드에서는 모든 메서드 코드를 블록 동기화했기에 성능상의 차이가 없다.
		synchronized (this) {
			int getData = data;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			data = getData + 1;
		}
		// 하지만 블록 동기화가 되는 부분 이후의 작업량이 증가 할수록 성능의 차이가 확연히 드러난다.
	}
}
