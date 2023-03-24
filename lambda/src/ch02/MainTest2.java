package ch02;

import java.util.Iterator;

public class MainTest2 {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i <100; i++) {
					System.out.println(" i : " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}).start();
		
		System.out.println("------------------------");
		// 안 적어주더라도 알수있는거는 안적어줘도 됨
		// new Thread( ()-> {
		//     실행문              }).start
		
		new Thread( ( ) ->{ 
				for (int i = 0; i < 10; i++) {
					System.out.println(" i : "+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		} ).start();
		
	}

}
