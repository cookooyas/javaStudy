package oop16.thread05;

public class PlusThread extends Thread {
	MyData myData;

	public PlusThread(MyData myData) {
		this.myData = myData;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		myData.plusData(); // 1 증가 메서드
		System.out.println(getName() + " 실행 결과 : " + myData.data);
	}

}
