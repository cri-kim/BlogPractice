package integer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

/**
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 */

public class Backjun1978 {
	@Test
	public void test() {

		String s2 = "1 3 5 7";
		String[] numbers = s2.split(" ");
		printPrimeNumberCount(numbers);
	}
	
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			//수의 개수 n
			String s1 = br.readLine();
			//수 입력
			String s2 = br.readLine();
			String[] numbers = s2.split(" ");
			
			printPrimeNumberCount(numbers);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void printPrimeNumberCount(String[] numbers) {
		int cnt = 0;
		
		for(int i=0;i < numbers.length ;i++ ) {
			int number = Integer.valueOf(numbers[i]);
			
			if(isPrimeNumber(number)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	//소수 판별
	public static boolean isPrimeNumber(int n) {
		boolean flag = false;
		int cnt = 0;
		for(int i=2; i <= n ; i++) {
			if(n % i == 0) {
				cnt ++;
			}
		}
		//소수는 자기 자신과 1로만 나누었을 때 나머지가 1이다.
		if(cnt == 1) {
			flag = true;
		}
		return flag;
	}
}
