package livestudy.week.nine;

import org.junit.jupiter.api.Test;

public class PracticeException1 {
	public int makeException(int a, int b) {
		return a/b;
	}
	
	@Test
	public void testMakeException() {
		makeException(10,20); // success
		makeException(10,0); // exception
		//makeException(10,0.0); // error
	}
}
