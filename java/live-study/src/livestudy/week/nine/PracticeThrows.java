package livestudy.week.nine;

import org.junit.jupiter.api.Test;

public class PracticeThrows {
	public int mod(int a, int b) throws ArithmeticException{
		return a/b;
	}
	
	@Test
	public void testMod() {
		mod(10, 0);
	}
	
	public void makeException() throws Exception{
		throw new Exception("������ ������ ��������ϴ�.");
	}
	
	@Test
	public void testThrows() {
		try {
			makeException();
		} catch (Exception e) {
			System.out.println("����ó���� ���⼭ �߻��߽��ϴ�.");
			System.out.println(e.getMessage());
		}
	}
}
