package livestudy.week.nine;

import org.junit.jupiter.api.Test;

public class TestCustomException {
	@Test
	public void testCustomException() {
		try {
			throw new CustomException("Runtime Exception을 상속받아 만든 커스텀 익셉션");
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void testCustomException2() {
		try {
			throw new CustomException("Runtime Exception을 상속받아 만든 커스텀 익셉션",2);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
