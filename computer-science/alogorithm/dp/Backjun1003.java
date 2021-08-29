package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.Test;

/*
 * [시간초과]
 * 다음 소스는 N번째 피보나치 수를 구하는 C++ 함수이다.

int fibonacci(int n) {
    if (n == 0) {
        printf("0");
        return 0;
    } else if (n == 1) {
        printf("1");
        return 1;
    } else {
        return fibonacci(n‐1) + fibonacci(n‐2);
    }
}
fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.

fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
fibonacci(0)은 0을 출력하고, 0을 리턴한다.
fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 
0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.*/
public class Backjun1003 {
	
	@Test
	 public void test() {
		 dp = new int[2];
			dp[0]=0;
			dp[1]=0;
			//피보나치 실행
			fibonacci(40);
			//값 출력
			System.out.println(dp[0] + " "+dp[1]);
	 }
	
	public static int[] dp;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			//테스트 케이스 갯수
			int t = Integer.parseInt(br.readLine());
			dp = new int[2];
			for(int i=0;i<t;i++) {
				//초기화
				dp[0]=0;
				dp[1]=0;
				//피보나치 실행
				fibonacci(Integer.parseInt(br.readLine()));
				//값 출력
				//System.out.println(dp[0] + " "+dp[1]);

		        bw.write(dp[0] + " " + dp[1]);
		        bw.flush();
			}
	        bw.close();
	        br.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int fibonacci(int n) {
	    if (n == 0) {
	    	dp[0] += 1;
	        return 0;
	    } else if (n == 1) {
	    	dp[1] += 1;
	        return 1;
	    } else {
	        return (fibonacci(n-1) + fibonacci(n-2));
	    }
	}
}
