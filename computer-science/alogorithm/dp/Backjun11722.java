import java.io.*;

public class Backjun11722 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			
			String[] arr = br.readLine().split(" ");
			int[] dp = new int[n];
			for(int i=0;i<n;i++) {
				dp[i] = 1;
				for(int j=0;j<i+1;j++) {
					if(Integer.parseInt(arr[i]) < Integer.parseInt(arr[j]) && dp[j] + 1 > dp[i]) {
						dp[i] = dp[j]+1;
					}
				}
			}
			int max = 0;
			for(int i=0;i<n;i++) {
				if(dp[i]>max) {
					max = dp[i];
				}
			}
			System.out.println(max);
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

