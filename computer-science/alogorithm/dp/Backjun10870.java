import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
*/
public class Backjun10870 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			int[] dp = new int[n+1];
			if(n == 0) {
				dp[0] = 0;
			}
			else if(n == 1) {
				dp[1] = 1;
			}
			else {
				dp[0] = 0;
				dp[1] = 1;
				dp[2] = 1;
				//n 까지 피보나치 계산
				for(int i=3;i<n+1;i++) {
					dp[i] = (dp[i-2] + dp[i-1]);
				}
			}
			bw.write(String.valueOf(dp[n]));
			bw.flush();
			bw.close();
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}