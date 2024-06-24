package oop16.thread07;

class DataBox {
	int data;

	synchronized void inputData(int data) {
		this.data = data;
		System.out.println("입력 데이터 : " + data);
	}

	synchronized void outputData() {
		System.out.println("출력 데이터 : " + data);
	}

}

public class Waiting_WaitNotify_1 {
	public static void main(String[] args) {
		DataBox db = new DataBox();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					db.inputData(i);
				}
			};
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					db.outputData();
				}
			};
		};

		t1.start();
		t2.start();

	}
}
