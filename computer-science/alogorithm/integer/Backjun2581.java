package integer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

/*자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 
소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 
이들 소수의 합은 620이고, 최솟값은 61이 된다*/

public class Backjun2581 {
	@Test
	public void test() {
		int m = 1;
		int n = 2;
		int[] primeNumbers = getPrimeNumber(m,n);
		print(m,n,primeNumbers);
	}
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 1. 첫째줄에 M 입력
			int m = Integer.valueOf(br.readLine());
			// 2. 둘째 줄에 n 입력
			int n = Integer.valueOf(br.readLine());
			// m < 자연수  < n
			//자연수 중 소수인 것들을 골라 소수의 합과 최솟값은 찾는다.
			//3. 소수 찾기
			int[] primeNumbers = getPrimeNumber(m,n);
			//4. 소수의 합 출력 & 최솟값 출력
			print(m,n,primeNumbers);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int[] getPrimeNumber(int m, int n){
		//에라토스테네스의 체로 비소수 삭제
		int[] arr  = new int[n+1];
		for(int i=1 ;i < n + 1 ;i++) {
			arr[i] = 0;
		}
		//1은 소수
		arr[1] = 1;
		for(int i=2 ; i< n+1 ;i++) {
			for(int j=2 ; i*j < n+1 ; j++) {
				arr[i*j] = 1;
			}
		}
		return arr;
	}
	public static void print(int m, int n, int[] numbers) {
		int sum = 0;
		int min = 0;
		for(int i=m;i<n+1 ; i++) {
			if(numbers[i] != 1) {
				sum+=i;
			}else {
				continue;
			}
			if(min > 0) {
				continue;
			}
			min += i;
		}
		//소수가 없을 경우 -1을 출력한다.
		if(sum == 0)
		{
			System.out.println("-1");
			return;
		}
		System.out.println(sum);
		System.out.println(min);
	}
}
