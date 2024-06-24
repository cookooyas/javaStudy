package oop16.thread07;

class DataBox2 {
	int data;
	boolean isEmpty = true;

	synchronized void inputData(int data) {
		if (!isEmpty) {
			try {
				System.out.println("아웃풋 깨움");
				System.out.println("인풋 일안함");
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.data = data;
		isEmpty = false;
		System.out.println("입력 데이터 : " + data);
		notify();
	}

	synchronized void outputData() {
		if (isEmpty) {
			try {
				System.out.println("인풋 깨움");
				System.out.println("아웃풋 일안함");
				wait();
			} catch (InterruptedException e) {
			}
		}
		isEmpty = true;
		System.out.println("출력 데이터 : " + data);
		notify();
	}

}

public class Waiting_WaitNotify_2 {
	public static void main(String[] args) {
		DataBox2 db = new DataBox2();
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
