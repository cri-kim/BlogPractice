package livestudy.week.ten;

public class TempClass {
	public void execute(String msg){
		System.out.println("execute : " + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.err.println("multiThread1 execute interrupted.");
		}
		System.out.println("end. "+ msg);
	}
}
