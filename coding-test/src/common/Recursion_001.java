package common;

import java.util.ArrayList;
import java.util.List;

/* * 
 * 2020.11.14
 * CodeUp (코드업)
 * https://codeup.kr/problemsetsol.php?psid=21
 * */
public class Recursion_001 {

	public void solution() {
		question_1953(5,1);
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
	public void question_3702() {
		
	}
	public void question_3704() {
		
	}
	public void question_3733() {
		
	}
	public void question_4564() {
		
	}
}
