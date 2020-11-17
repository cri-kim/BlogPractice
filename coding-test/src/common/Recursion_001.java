package common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* * 
 * 2020.11.14/11.15/11.16/11.17
 * CodeUp (코드업)
 * https://codeup.kr/problemsetsol.php?psid=21
 * */
public class Recursion_001 {

	public void solution() {
		question_4564();
//		question_1953(5,1);
	}
	public void question_1901(int n, int cur) {
		System.out.println(cur);
		if(cur == n) return;
		question_1901(n,cur+1);
	}
	public void question_1902(int n) {
		if(n < 1) return;
		System.out.println(n);
		question_1902(n-1);
		
	}
	public void question_1904_1(int a, int b) {
		if(a%2 == 1) {//시작이 홀수일 경우
			question_1904_2(a,b,a+2);
		}else {//시작이 짝수일 경우
			question_1904_2(a,b,a+1);
		}
	}
	public void question_1904_2(int a, int b, int cur) {
		if(cur > b) return;
		System.out.println(cur);
		question_1904_2(a,b,cur+2);
	}
	public void question_1905(int n, int sum) {
		//스트림 만세, 근데 재귀로 해야함
//		System.out.println(IntStream.range(0, n).sum());
		if(n < 1) {
			System.out.println(sum);
			return;
		}
		sum += n;
		question_1905(n-1, sum);
	}
	public void question_1912(int n, int result) {
		if(n < 1) {
			System.out.println(result);
			return;
		}
		result *= n;
		question_1912(n-1, result);
	}

	public void question_1915_1(int n) {
		if(n == 1) {
			System.out.println(1);
			return;
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		question_1915_2(n, 2, list);
	}
	public void question_1915_2(int n, int cur, List<Integer> list) {
		int val = list.get(cur-2) + list.get(cur-1);
		list.add(val);
		if(n == cur) {
			System.out.println(list.get(cur));
			return;
		}
		question_1915_2(n,cur+1, list);
	}
	public void question_1916_1(int n) {
		if(n == 1) {
			System.out.println(1);
			return;
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		question_1916_2(n, 2, list);
	}
	public void question_1916_2(int n, int cur, List<Integer> list) {
		int val = list.get(cur-2) + list.get(cur-1);
		list.add(val);
		if(n == cur) {
			System.out.println(list.get(cur) % 10009);
			return;
		}
		question_1916_2(n,cur+1, list);
	}
	public void question_1920(int n, StringBuilder str) {
		if(n < 2) {
			str.append(String.valueOf(n));
			System.out.println(str.reverse());
			return;
		}
		str.append(String.valueOf(n%2));
		n = n/2;
		question_1920(n, str);
	}
	public void question_1928(int n, int val) {
		if(n == 1) {
			System.out.println(n);
			return;
		}
		if(val == 0 ) {//start
			System.out.println(n);
		}
		if(n % 2 == 1) {
			val = 3*n + 1;
		}
		else {
			val = n/2;
		}
		question_1928(val, 0);
	}
	public void question_1929_1(int n) {
		StringBuilder str = question_1929_2(n, 0, new StringBuilder());
		System.out.println(str);
	}
	public StringBuilder question_1929_2(int n, int val, StringBuilder str) {
		if(n == 1) {
			str.insert(0,"\n");
			str.insert(0,n);
			return str;
		}
		if(val == 0 ) {//start
			str.insert(0,"\n");
			str.insert(0,n);
		}
		if(n % 2 == 1) {
			val = 3*n + 1;
		}
		else {
			val = n/2;
		}
		return question_1929_2(val, 0, str);
		
	}
	private int superSum = 0;
	public void question_1930_1() {
		int [][] examples = {{1,3},{2,3},{4,10},{10,10}};
		for(int[] example : examples) {
			superSum=0;
			int k = example[0];
			int n = example[1];
			question_1930_2(k,n);
			System.out.println(superSum);
		}
	}
	public void question_1930_2(int k, int n) {
		if(k == 0) {
			superSum += n;
			return;
		}
		for(int i=1;i<n+1;i++) {
			question_1930_2(k-1, i);
		}
	}
	public void question_1953(int n, int cur) {
		if(n == 0) return;
		if(n == cur) {
			System.out.print("*");
			question_1953(n, cur+1);
		}else {
			System.out.println();
			question_1953(n-1, 1);
		}
	}
	/* 실수로 재귀 아닌걸로 풀었는데, 삼각형 만드는 부분을 재귀로 하면 됨*/
	public void question_3702() {
		int r = 3;
		int c = 2;
		int n = r>c?r:c;
		int[][] triangle = getPascalTriangle(n);
		System.out.println(triangle[r-1][c-1]);
	}
	public int[][] getPascalTriangle(int n) {
		int[][] arr = new int[n][n];
		for(int i=0; i <n ; i++) {
			for(int j=0; j<n ;j++) {
				//벽에 도달한 경우
				if(i == 0 || j == 0) {
					arr[i][j] = 1;
				}
				else {//벽이 아닌 경우
					arr[i][j] = arr[i][j-1] + arr[i-1][j];
				}
			}
		}
		return arr;
	}

	/*2020.11.17 시간초과*/
	private int stairsCnt = 0;
	public void question_3704() {
		int answer = 0;
		question_3704_1(3);
		/* *
		 * 1 or 2 or 3 계단씩 오를 수 있다.
		 * 계단을 오를 수 있는 경우의 수 % 1000 
		 * */
		 answer = this.stairsCnt % 1000;
		 System.out.println(answer);

	}
	public void question_3704_1(int n) {
		if(n < 0) {
			return;
		}
		if(n == 0) {
			this.stairsCnt++;
			return;
		}
		question_3704_1(n-1);
		question_3704_1(n-2);
		question_3704_1(n-3);
	}
	
	/*시간초과*/
	public void question_3733() {
		int a=0;
		int b =0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int max = 0;
		int maxIdx = a;
		for(int i=a;i<b+1;i++) {
			int tempVal = question_3733_1(i,0);
			if(tempVal > max) {
				max = tempVal;
				maxIdx = i;
			}
			tempVal = 0;
		}
		System.out.println( maxIdx +" " +max);
		
	}
	public int question_3733_1(long n, int cnt) {
		cnt++;
		if(n == 1) {
			return cnt;
		}
		if(n % 2 == 1) {
			n = 3*n + 1;
		}
		else {
			n = n/2;
		}
		return question_3733_1(n, cnt);
	}
	
	/*대표적인 DP 문제 - 규칙성을 발견하여 수식을 만들어야함
	 * = 백준 2579번
	 * 설명 잘 되어있는 블로그
	 * https://sundries-in-myidea.tistory.com/22
	 * */
	public void question_4564() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int T = Integer.parseInt(br.readLine());
			int f[] = new int[T + 1];
			int cache[] = new int[T + 1];
			for (int i = 1; i <= T; i++) {
				f[i] = Integer.parseInt(br.readLine());
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
