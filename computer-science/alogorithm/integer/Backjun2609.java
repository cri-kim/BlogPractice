package integer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

/*
 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 * */
public class Backjun2609 {
	@Test
	public void test() {
		int a = 24;
		int b = 18;

		int gcd = printGcd(a,b);
		printLcm(a,b, gcd);
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 1. 두 개의 자연수 입력 ( 0 <= a,b <= 10000)
			String str = br.readLine();
			int a = Integer.valueOf(str.split(" ")[0]);
			int b = Integer.valueOf(str.split(" ")[1]);

			int gcd = printGcd(a,b);
			printLcm(a,b, gcd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 2. 최대공약수 출력
	public static int printGcd(int a, int b) {
		// 유클리드 호제법으로 최대 공약수를 구한다.
		int c = 0;
		//2.1. a >= b 로 값을 고정 
		if (a < b) {
			c = a;
			a = b;
			b = c;
		}
		while(a%b != 0) {
			//2.2. a/b를 반복 진행하여 나머지를 구한다. (나머지로 나눈 값이 0이 될 때까지 진행)
			c= b;
			b = a % b;
			a = c;
		}
		System.out.println(b);
		return b;
	}

	// 3. 최소공배수 출력
	public static void printLcm(int a, int b, int gcd) {
		//최소공배수 공식
		int lcm = a * b / gcd;
		System.out.println(lcm);
	}
	
}
