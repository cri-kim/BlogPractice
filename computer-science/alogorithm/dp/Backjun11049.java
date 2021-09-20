package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjun11049 {
	private static int[][] arr = new int[501][2];
	private static int[][] dp = new int[501][501];
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				String[] input = br.readLine().split(" ");
				int r = Integer.parseInt(input[0]);
				int c = Integer.parseInt(input[1]);
				arr[i][0]=r;
				arr[i][1]=c;
			}
			
			for(int i=1; i<n; i++) {
	            for(int j=0; j<n-i; j++) {
	                dp[j][j+i] = Integer.MAX_VALUE;
	                for(int k=0; k<i; k++) {
	                    int cost = dp[j][j+k] + dp[j+k+1][j+i] + arr[j][0] * arr[j+k][1] * arr[j+i][1];
	                    dp[j][j+i] = Math.min(dp[j][j+i], cost);
	                }
	            }
	        }
	        System.out.println(dp[0][n-1]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
