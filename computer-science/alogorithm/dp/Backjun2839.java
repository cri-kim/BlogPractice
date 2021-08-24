package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.Test;

/*
 * [해당문제는 greedy, dp 로 해결가능]
 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 
 * 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

	상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
	예를 들어, 18킬로그램 설탕을 배달해야 할 때, 
	3킬로그램 봉지 6개를 가져가도 되지만, 
	5킬로그램 3개와 3킬로그램 1개를 배달하면,
	 더 적은 개수의 봉지를 배달할 수 있다.
	
	상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 
	봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 * 
 * */
public class Backjun2839 {
	@Test
	public void test() {
		for(int i=3 ; i< 5001; i++) {
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
			//1. 첫째 줄에 N 입력(3<= n <= 5000)
			
			//2. n+1 만큼의 배열을 만든다.
			//배송 봉지 횟수를 저장해 나가는 배열이다.
			int[] dp = new int[n < 5? 6 : n+1];
			for(int i=0;i<=n;i++) {
				dp[i] = 0;
			}
			
			//3. n kg 이 3kg, 5kg 봉지로 배송
			//최소 1회 배송을 하기 때문에, 3과 5에 1회 배송을 넣는다.
			dp[3] = dp[5] = 1;
			
			//3.상근이가 배달하는 봉지의 최소개수 구하기
			for( int i = 6 ; i<= n; i++) {
				//3.1. 3kg로 배송이 가능할때마다 봉지에 대한 카운트가 늘어난다.
				if(dp[i-3] > 0) {
					dp[i] = dp[i-3] + 1;
				}
				//3.2. 5kg 배송이 가능할 때마다 봉지에 대한 카운트가 늘어난다.
				if(dp[i-5] > 0) {
					if(dp[i] > 0) {
						dp[i] = Math.min(dp[i], dp[i-5] + 1);
					}
					else {
						dp[i] = dp[i-5] + 1;
					}
				}
			}
			return dp[n] > 0 ? dp[n] : -1;
	}
}
