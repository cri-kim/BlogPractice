package integer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 * */
public class Backjun1929 {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s1 = br.readLine();
			String[] numbers = s1.split(" ");
			int m = Integer.valueOf(numbers[0]);
			int n = Integer.valueOf(numbers[1]);
			
			int[] arr = new int[n+1];
			for(int i=0;i<n+1;i++) {
				arr[i] = 0;
			}
			arr[1] = 1;
			
			for(int i=2;i<n+1;i++) {
				for(int j= 2; i*j < n+1;j++) {
					arr[i*j] = 1;
				}
			}
			
			//소수 판별 - 에라토스테네스의 체
			for(int i = m ; i< n+1 ;i++ ) {
				if(arr[i] != 1) {
					System.out.println(i);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
