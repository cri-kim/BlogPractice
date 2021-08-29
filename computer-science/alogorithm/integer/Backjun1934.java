package integer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

/*
 * 두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다.
 *  이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 
 *  예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
 *  두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오
 * */
public class Backjun1934 {
	@Test
	public void test() {

		int t = 3;

		int gcd = getGcd(1,45000);
		printLcm(1, 45000, gcd);
		gcd = getGcd(6,10);
		printLcm(6, 10, gcd);
		gcd = getGcd(13,17);
		printLcm(13, 17, gcd);
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			//1. 케이스의 개수
			int t = Integer.parseInt(br.readLine());
			for (int i=0;i<t;i++) {
				//2. A 와 B 입력
				String input = br.readLine();
				int a = Integer.parseInt(input.split(" ")[0]);
				int b = Integer.parseInt(input.split(" ")[1]);
				int gcd = getGcd(a,b);
				printLcm(a, b, gcd);
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int getGcd(int a, int b) {
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
		return b;
	}
	
	// 3. 최소공배수 출력
	public static void printLcm(int a, int b, int gcd) {
		//최소공배수 공식
		int lcm = a * b / gcd;
		System.out.println(lcm);
	}
}
