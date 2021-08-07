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
		throw new Exception("강제로 오류를 만들었습니다.");
	}
	
	@Test
	public void testThrows() {
		try {
			makeException();
		} catch (Exception e) {
			System.out.println("예외처리는 여기서 발생했습니다.");
			System.out.println(e.getMessage());
		}
	}
}
