import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjun2579 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 계단 점수 획득 총 갯수
			int n = Integer.parseInt(br.readLine());

			int[] stair = new int[n + 1];
			//계단당 점수
			int[] scores = new int[n + 1];
			for (int i = 1; i < n + 1; i++) {
				int score = Integer.parseInt(br.readLine());
				scores[i] = score;
			}
			
			scores[0] = stair[0] = 0;
			stair[1] = scores[1];
			if(n>1) {
				stair[2] = scores[1] + scores[2];
	
				for(int i=3;i<n+1;i++) {
					stair[i] = Math.max(stair[i-2], stair[i-3]+scores[i-1]) + scores[i];
				}
			}
			
			//최댓값 출력
			System.out.println(stair[n]);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
