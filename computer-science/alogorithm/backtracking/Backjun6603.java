package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 로또
 * 독일 로또는 {1, 2, ..., 49}에서 수 6개를 고른다.

로또 번호를 선택하는데 사용되는 가장 유명한 전략은 49가지 수 중
 k(k>6)개의 수를 
골라 집합 S를 만든 다음 그 수만 가지고 번호를 선택하는 것이다.
 * */
public class Backjun6603 {
	
	private final static int PICK = 6;
	private final static int MAX = 15;
	private static int[] lotto= new int[MAX] ;
	private static int[] set = new int[MAX];
	private static int k ;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = "";
			// k k개의 수 입력
			while( !(line = br.readLine()).equals("0")) {
				setLotto(line);
				dfs(0,0);
				System.out.println();
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void dfs(int s, int d) {
		if(d == PICK) {
			for(int i=0;i<PICK;i++) {
				System.out.print(set[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=s ; i<k;i++) {
			set[d] = lotto[i];
			dfs(i+1, d+1);
		}
	}
	public static void setLotto(String line) {
		String[] input = line.split(" ");
		k = Integer.parseInt(input[0]);
		
		for(int i=1 ; i < input.length ; i++) {
			lotto[i-1]=Integer.parseInt(input[i]);
		}
	}
}
