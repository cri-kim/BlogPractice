package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * 초기에 {0}, {1}, {2}, ... {n} 이 각각 n+1개의 집합을 이루고 있다. 
 * 여기에 합집합 연산과, 두 원소가 같은 집합에 포함되어 있는지를 확인하는 연산을 수행하려고 한다.
 * 집합을 표현하는 프로그램을 작성하시오.
 * */
public class Backjun1717_1 {
	
	private static int[] parent;
	
	public static void main(String[] args) {
		//n : 집합a,b의 크기 제한 (0<= a,b <= n)
		//m : 입력 연산 개수 
		int n, m;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] str = br.readLine().split(" ");
			n = Integer.valueOf(str[0]);
			m = Integer.valueOf(str[1]);
			
			parent = new int[n+1];
			//초기 map 생성
			for(int i=0 ; i < n+1 ; i++) {
				parent[i]=i;
			}
			
			//연산 시작
			for(int i=0 ; i < m ; i++) {
				//입력값 : 연산자 집합a 집합b
				execute(br.readLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void execute(String str) {
		String[] arr = str.split(" ");
		String op = arr[0];
		String a = arr[1];
		String b = arr[2];
		
		if(op.equals("0")) {
			union(Integer.valueOf(a),Integer.valueOf(b));
		}else {
			isSibiling(Integer.valueOf(a),Integer.valueOf(b));
		}
	}
	
	//op가 0 일 경우, 합집합
	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		
		if(a != b) {
			//위치에 집합 값 넣기
			parent[b] = a;
		}
	}
	public static int find(int x) {
		if(x == parent[x]) {
			return x;
		}
		else {
			return parent[x] = find(parent[x]);
		}
	}
	
	//op가 1일 경우, 같은 집합인지 확인
	public static void isSibiling(int a, int b) {
		a = find(a);
		b = find(b);
		
		if(a == b) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
