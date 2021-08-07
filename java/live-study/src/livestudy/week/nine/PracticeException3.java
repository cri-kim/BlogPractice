package livestudy.week.nine;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class PracticeException3 {
	public int makeException(int a, int b) {
		try {
			throw new ArithmeticException("hello");
		}        
		//Unreachable catch block for ArithmeticException. It is already handled by the catch block for RuntimeException
        //위에 하위 레벨 exception 이니 이러지 말라고 뜸
//		catch (RuntimeException e) {
//			//exception 발생 시, 처리 코드
//			System.out.println("Exception 발생");
//			return 0;
//		}
		catch (ArithmeticException e) {
			//exception 발생 시, 처리 코드
			System.out.println("ArithmeticException 발생");
			return 0;
		}
	}
	
	@Test
	public void testMakeException() {
		assertEquals(makeException(10,0),0);
	}
	
	public void makeException2() {
		File file = new File("where is my file?");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testMakeException2() {
		makeException2();
	}
	
	public int 나누기(int a, int b, int type) {
		int arr[] = {1,2,3};
		try {
			a += arr[type];
			return a/b;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("에러잡았다.");
			return 0;
		}
	}
	@Test
	public void 예외두개잡아() {
		나누기(10,0,1);
		나누기(10,0,4);
	}
}
