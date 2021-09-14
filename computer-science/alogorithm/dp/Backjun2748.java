package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 피보나치 수2
 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 
 * 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

	이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
	
	n=17일때 까지 피보나치 수를 써보면 다음과 같다.
	
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	
	n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 * */
public class Backjun2748 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			//n은 90보다 작거나 같은 자연수
			int n = Integer.parseInt(br.readLine());
			if(n < 2) {
				System.out.println(n);
			}
			else {
				//90 일 경우, 1억이 넘어 int 의 범위를 초과한다.
				//더 길이가 긴 long 을 사용하였다.
				long [] dp = new long[n+1];
				dp[0]=0;
				dp[1]=1;
				for(int i=2;i<n+1;i++) {
					dp[i] = dp[i-1]+dp[i-2];
				}
				System.out.println(dp[n]);
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
