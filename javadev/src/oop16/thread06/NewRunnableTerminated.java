package oop16.thread06;

public class NewRunnableTerminated {
	public static void main(String[] args) {
		Thread myThread = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(long i = 0;i<1000000000l;i++) {
					
				}
			}
			
		};
		Thread.State state = myThread.getState();
		System.out.println("myThread state : "+state); // NEW
		
		myThread.start();

		state = myThread.getState();
		System.out.println("myThread state : "+state); // RUNNABLE
		
		try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		state = myThread.getState();
		System.out.println("myThread state : "+state); // TERMINATED
	}
}
