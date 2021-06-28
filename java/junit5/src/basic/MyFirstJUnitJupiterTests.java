package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 참조 : https://junit.org/junit5/docs/current/user-guide/#writing-tests
 * @author kcpi
 *
 * JUnit5 = JUnit Platform + JUnit Jupiter + JUnit Vintage
 * JUnit Jupiter = JUnit5에서 테스트를 위해 만들어진 프로그래밍 모델과 extension 모델으 조합이다.
 * 				 = TestEngine 제공
 * 
 * 
 * first setting
 * build path-> configurae build path -> libraries -> add Library -> select junit
 */
public class MyFirstJUnitJupiterTests {

	private final Caculator caculator = new Caculator();
	
	@Test
	void addition() {
		assertEquals(2, caculator.add(1, 1));
	}
	
	class Caculator {
		public int add(int a, int b) {
			return a+b;
		}
	}
}
