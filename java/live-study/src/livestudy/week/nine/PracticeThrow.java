package livestudy.week.nine;

import org.junit.jupiter.api.Test;

public class PracticeThrow {

	public void makeException()  {
		try {
			throw new Exception("������ ������ ��������ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void testMakeException() {
		makeException();
	}
}
