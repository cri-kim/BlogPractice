package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
	
	@BeforeAll
	static void init() {
		System.out.println("@BeforeAll - executes once before all test methods in this class");
	}
    
	@BeforeEach
	void setup() {
		System.out.println("@BeforeEach - executes each before all test methods in this class");
	}
	
	@Test
	void addition() {
		assertEquals(2, caculator.add(1, 1));
	}
	
	class Caculator {
		public int add(int a, int b) {
			return a+b;
		}
	}
	
	@DisplayName("동작 성공")
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,5,6,7,8,9,0})
	void addtion2(int item) {
		int result = item + 1;
		assertEquals(result, caculator.add(item, 1));
	}
}
