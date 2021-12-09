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
        //���� ���� ���� exception �̴� �̷��� ����� ��
//		catch (RuntimeException e) {
//			//exception �߻� ��, ó�� �ڵ�
//			System.out.println("Exception �߻�");
//			return 0;
//		}
		catch (ArithmeticException e) {
			//exception �߻� ��, ó�� �ڵ�
			System.out.println("ArithmeticException �߻�");
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
	
	public int ������(int a, int b, int type) {
		int arr[] = {1,2,3};
		try {
			a += arr[type];
			return a/b;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("������Ҵ�.");
			return 0;
		}
	}
	@Test
	public void ���ܵΰ����() {
		������(10,0,1);
		������(10,0,4);
	}
}
