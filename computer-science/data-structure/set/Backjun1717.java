package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * <<시간초과>>
 * 
 * 초기에 {0}, {1}, {2}, ... {n} 이 각각 n+1개의 집합을 이루고 있다. 
 * 여기에 합집합 연산과, 두 원소가 같은 집합에 포함되어 있는지를 확인하는 연산을 수행하려고 한다.
 * 집합을 표현하는 프로그램을 작성하시오.
 * */
public class Backjun1717 {
	
	@Test
	public void test() {
		 int n=7, m=8;

		//초기 집합 {0},{1},{2},{3},...,{7}
		 map = new HashMap<String,String>();
		//초기 set list 생성
		for(int i=0;i<n+1;i++) {
			map.put(String.valueOf(i),String.valueOf(i));
		}
		
		//{0},{1,3},{2},{4},{5},{6},{7}
		execute("0 1 3");
		
		execute("1 1 7");
		//{0},{1,3},{2},{4},{5},{6,7}
		execute("0 7 6");
		
		execute("1 7 1");
		//{0},{2},{4},{5},{1,3,6,7}
		execute("0 3 7");
		//{0},{2,4},{5},{1,3,6,7}
		execute("0 4 2");
		//{0},{2,4},{5},{1,3,6,7}
		execute("0 1 1");
		
		execute("1 1 1");
	}
	@Test
	public void test2() {
		 int n=100000, m=100000;

		//초기 집합 {0},{1},{2},{3},...,{7}
		map = new HashMap<String,String>();
		//초기 set list 생성
		for(int i=0;i<n+1;i++) {
		map.put(String.valueOf(i),String.valueOf(i));
		}
		for (int i=0;i<m-1;i++) {
		//{0},{1,3},{2},{4},{5},{6},{7}
		execute("0 100000 "+i);
		}
		execute("1 1 1");
	}
	
	private static Map<String, String> map;
	public static void main(String[] args) {
		//n : 집합a,b의 크기 제한 (0<= a,b <= n)
		//m : 입력 연산 개수 
		int n, m;
		map = new HashMap<String,String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] str = br.readLine().split(" ");
			n = Integer.valueOf(str[0]);
			m = Integer.valueOf(str[1]);
			
			//초기 map 생성
			for(int i=0 ; i < n+1 ; i++) {
				map.put(String.valueOf(i),String.valueOf(i));
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
			union(a,b);
		}else {
			isEqual(a,b);
		}
	}
	
	//op가 0 일 경우, 합집합
	public static void union(String a, String b) {
		String vA = map.get(a);
		String vB = map.get(b);
		for(String k : map.keySet()) {
			if(map.get(k).equals(vB)) {
				map.put(k, vA);
			}
		}
	}
	
	//op가 1일 경우, 같은 집합인지 확인
	public static void isEqual(String a, String b) {
		if(map.get(a).equals(map.get(b))) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
