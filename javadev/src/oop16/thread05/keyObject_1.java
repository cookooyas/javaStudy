package oop16.thread05;

class MyData2 {
	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	synchronized void bcd() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	void cde() {
		synchronized (this) {

			for (int i = 0; i < 3; i++) {
				System.out.println(i + "번 째");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}

			}
		}
	}

	void def() {
		synchronized (new Object()) {

			for (int i = 0; i < 3; i++) {
				System.out.println(i + "등");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}

			}
		}
	}
}

public class keyObject_1 {
	public static void main(String[] args) {
		MyData2 myData = new MyData2();

		// 익명객체 쓰레드 1
		new Thread() {
			public void run() {
//				this.setPriority(10);
				setPriority(MAX_PRIORITY);
				myData.abc();
			}
		}.start();

		// 익명객체 쓰레드 2
		new Thread() {
			public void run() {
//				this.setPriority(10);
				setPriority(MAX_PRIORITY);
				myData.bcd();
			}
		}.start();

		// 익명객체 쓰레드 3
		new Thread() {
			public void run() {
//				this.setPriority(1);
				setPriority(MIN_PRIORITY);
				myData.cde();
			}
		}.start();

		// 익명객체 쓰레드 4 : def는 다른 객체 키를 이용하기 때문에 다른 쓰레드의 동기를 기다릴 필요가 없다.
		new Thread() {
			public void run() {
//				this.setPriority(1);
				setPriority(MIN_PRIORITY);
				myData.def();
			}
		}.start();
	}
}
