package oop16.thread04;

class MyThread3 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName() + ": " + (isDaemon() ? "데몬 쓰레드" : "일반 쓰레드"));
		int i = isDaemon() ? 2 : 0;
		if (isDaemon())
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		for (; i < 6; i++) {
			System.out.println(getName() + ": " + i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}

public class ThreadProperties3_3 {
	public static void main(String[] args) {
		Thread thread3 = new MyThread3();
		thread3.setDaemon(true);
		thread3.setName("데몬 쓰레드");
		thread3.start();

		Thread thread4 = new MyThread3();
		thread4.setDaemon(false);
		thread4.setName("일반 쓰레드");
		thread4.start();

		// *중요! 메인쓰레드를 포함한 이외의 모든 쓰레드가 종료될 때까지 데몬 쓰레드가 작동한다.
		// 메인 쓰레드 종료(3.5초) - 일반 쓰레드 종료(5초) - 데몬 쓰레드 함께 종료(5초)

		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 쓰레드 종료");
	}
}
