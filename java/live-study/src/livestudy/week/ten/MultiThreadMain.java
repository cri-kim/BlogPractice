package livestudy.week.ten;

public class MultiThreadMain {
	public static void main(String[] args) {
		TempClass c1 = new TempClass();
		PracticeThread2 t1 = new PracticeThread2("a", c1);
		PracticeThread2 t2 = new PracticeThread2("b", c1);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.err.println("interrupted");
		}
	}
	
}
class PracticeThread2 extends Thread{
	private String m;
	TempClass clazz;
	PracticeThread2(String m, TempClass clazz){
		this.m = m;
		this.clazz = clazz;
	}
	@Override
	public void run() {
		synchronized (m) {
			clazz.execute(m);
		}
	}
}
