package livestudy.week.nine;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PracticeException2 {

	public int mod(int a, int b) {
		try {
			return a/b;
		}catch (Exception e) {
			//exception 발생 시, 처리 코드
			System.out.println("Exception 발생");
			return 0;
		}
	}
	public int mod2(int a, int b) {
		try {
			return a/b;
		} catch (Exception e) {
			//exception 발생 시, 처리 코드
			System.out.println("Exception 발생");
			return 0;
		}finally {
			System.out.println("Finally 들어옴");
		}
	}
	public int mod3(int a, int b) {
		try {
			return a/b;
		} finally {
			System.out.println("Finally 들어옴");
		}
	}
	
	@Test
	public void testTryCatchFinally() {
		assertEquals(mod(10,0),0);
		assertEquals(mod2(10,0),0);
		assertEquals(mod3(10,0),0); //catch 가 없는 부분만 error 발생
	}
}
