import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * [해당문제는 greedy, dp 로 해결가능]
   모바일로 작성하여 오타가 있을 수 있습니다.
   ㅎㅏㄴㄱㅜㄱㅇㅓㄱㅏ ㅇㅏㄴㅆㅓㅈㅕㅇㅛ.
   So that it was written Engilsh.
   정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1
정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
   
 * * 
 * */
public class Backjun9095 {
	
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
      //1. input test case count.
			int n = Integer.parseInt(br.readLine());
			for(int i=0 ; i < n ;i++){
            //2. input test case
                int num=Integer.parseInt(br.readLine());
                int val = execute(num);
            //3.print value
			    System.out.println(val);
            }
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
  //solve
	public static int execute(int n) {
    //3. make array to input cal val
			int[] dp = new int[n < 3? 4 : n+1];
    //4. init arr
			for(int i=0;i<=n;i++) {
				dp[i] = 0;
			}
			
    //5. init what we know
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
			
			//6.경우의 수 구하기 << i copied the sentences
			for( int i = 4 ; i<= n; i++) {
        //we have to check all cases
        //For example, 3
        // 1 1 1
        // 1 2 
        // 2 1 
        // 3
				dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
			}
		return dp[n];
    }
}
