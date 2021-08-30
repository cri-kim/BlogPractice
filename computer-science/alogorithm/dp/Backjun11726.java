import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
*/
public class Backjun11726 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			//1. n의 값 입력
			int n = Integer.parseInt(br.readLine());
			//2. n번째 직사각형에서의 타일 총 갯수를 저장하는 배열을 만든다.
			int[] dp = new int[n+1];
			
			//3. 2 X 1의 직사각형의 경우, 2X1 한개의 타일로 한번만 사용하여 만들 수 있다.
			if(n == 1) {
				dp[1] = 1;
			}
			else {
				dp[1] = 1;
				//4. 2x2의 직사각형의 경우, 2X1 두개의 타일, 1X2 두개의 타일로 각각 만들어 총 2개의 방법의 수 가있다.
				dp[2] = 2;
				//5. 3,4,... 계산을 해보면 앞의 두 값을 더한 값이 n의 방법의 수가 된다.
				//이는 순열을 통해 점화식을 도출할 수 있는데....찾아보도록하자
				//나의 경우, 도형을 그려서 붙여보다가 이해를 했다. 만약 도형이 돌아간다면 dp[n-1] * dp[n-2]가 될 수도 있었을 것이다.
				for(int i=3;i<n+1;i++) {
					//6. 10007로 나눈 나머지를 출력한다.(int 범위 초과 오류해결)
					dp[i] = (dp[i-2] + dp[i-1])%10007;
				}
			}
			//7. 결과 값을 출력한다.
			bw.write(String.valueOf(dp[n]));
			bw.flush();
			bw.close();
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
