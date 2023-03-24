package ex1;

import java.util.Iterator;

public class MainTest1 {

	public static void main(String[] args) {

		new Thread(()->{
			for (int i = 0; i < 500; i++) {
				if (i%5 ==0 || i%3 ==0) {
					System.out.println(i);
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
	
	

}

