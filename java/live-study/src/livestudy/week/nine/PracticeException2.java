package livestudy.week.nine;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PracticeException2 {

	public int mod(int a, int b) {
		try {
			return a/b;
		}catch (Exception e) {
			//exception �߻� ��, ó�� �ڵ�
			System.out.println("Exception �߻�");
			return 0;
		}
	}
	public int mod2(int a, int b) {
		try {
			return a/b;
		} catch (Exception e) {
			//exception �߻� ��, ó�� �ڵ�
			System.out.println("Exception �߻�");
			return 0;
		}finally {
			System.out.println("Finally ����");
		}
	}
	public int mod3(int a, int b) {
		try {
			return a/b;
		} finally {
			System.out.println("Finally ����");
		}
	}
	
	@Test
	public void testTryCatchFinally() {
		assertEquals(mod(10,0),0);
		assertEquals(mod2(10,0),0);
		assertEquals(mod3(10,0),0); //catch �� ���� �κи� error �߻�
	}
}
