package livestudy.week.ten;

import org.junit.jupiter.api.Test;

//thread Ŭ������ ��� �޾� ����
public class PracticeThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("hi:"+getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("class Thread fin.");
	}
	@Test
	public void executeTest() {
		PracticeThread thread1 = new PracticeThread();
		Thread thread2 = new Thread(new PracticeThreadRunnable());
		
		thread1.start();
		thread2.start();
	}
}
//runnable �������̽��� �����Ͽ� ����
class PracticeThreadRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("interface Thread fin.");
	}
}