import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjun12865 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			//n개의 물건 k 만큼의 무게
			String input = br.readLine();
			int n = Integer.parseInt(input.split(" ")[0]);
			int k = Integer.parseInt(input.split(" ")[1]);
			int[][] item = new int[102][2];
			int[][] dp = new int[102][100003];
			
			for(int i=1;i<n+1;i++) {
				String input2 = br.readLine();
				int w =  Integer.parseInt(input2.split(" ")[0]);
				int v =  Integer.parseInt(input2.split(" ")[1]);
				item[i][0] = w;
				item[i][1] = v;
			}
			
			for(int i=1;i<n+1;i++) {
				//i번째 물건의 무게와 가치를 추출
				int w = item[i][0], v=item[i][1];
				
				//i 무게가 될때까지의 최고의 무게 합을 dp 에 저장한다.
				//최고 무게까지만 루프를 돈다.
				for(int j=0;j<k+1;j++) {
					//i번째 물건의 무게가 j무게보다 작은 경우, 
					if(j<item[i][0]) {
						//i번째 물건의 j 무게에서의 가치는 i-1번째 물건의 j무게에서의 가치이다.
						dp[i][j] = dp[i-1][j];
					}
					else {
						//i번째 물건의 j 무게에서의 가치는
						//이전 물건의 j무게의 가치와 이전 물건의 j-현 물건의 무게 가치 + 현 물건 가치의 가치 비교
						dp[i][j] =Math.max(dp[i-1][j], dp[i-1][j-w] + v);
					}
				}
			}
			
			System.out.println(dp[n][k]);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}