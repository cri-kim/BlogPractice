package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.Test;

/*
 * [해당문제는 greedy, dp 로 해결가능]
모바일로 작성하여 오타가 있을 수 있습니다.
다른 dp문제를 참고해주세요
 * * 
 * */
public class Backjun1463 {
	@Test
	public void test() {
		for(int i=1 ; i< 100001; i++) {
			System.out.println(i+" : " +execute(i));
		}
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			int val = execute(n);
			bw.write(String.valueOf(val));
			//example : 18일 경우,
			//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 
			//0 0 0 1 0 1 2 0 2 3 2  0  4   3 0  3  0  5  4
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int execute(int n) {
			int[] dp = new int[n < 3? 4 : n+1];
			for(int i=0;i<=n;i++) {
				dp[i] = 0;
			}
			
dp[2] = dp[3] = 1;
			
			//3.최소개수 구하기
			for( int i = 4 ; i<= n; i++) {
				if(i%3 == 0) {
					dp[i] = dp[i/3] + 1;
				}
				if(i%2 == 0) {
					if(dp[i] > 0) {
						dp[i] = Math.min(dp[i], dp[i/2] + 1);
					}
					else {
						dp[i] = dp[i/2] + 1;
					}
				}
                if(dp[i] > dp[i-1]+1){dp[i]=dp[i-1]+1;}
                if(dp[i] ==0)dp[i]=dp[i-1]+1;
			}
			return dp[n];
}
}
