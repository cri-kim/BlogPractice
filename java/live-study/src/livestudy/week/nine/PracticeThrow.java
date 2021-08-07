package livestudy.week.nine;

import org.junit.jupiter.api.Test;

public class PracticeThrow {

	public void makeException()  {
		try {
			throw new Exception("강제로 오류를 만들었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void testMakeException() {
		makeException();
	}
}
