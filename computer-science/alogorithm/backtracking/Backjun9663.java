package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * N-Queen
 * 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
 * */
public class Backjun9663 {
	private static int n;
	private static int count=0;
	private static int[] board;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			//n을 준다.
			n = Integer.parseInt(br.readLine());
			
			//체스 게임판의 1행 초기화
			board = new int[n];
			nqeeun(0);
			System.out.println(count);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void nqeeun(int cdx) {
		if(cdx == n) {
			count++;
			return;
		}
		
		for(int i=0 ; i < n ; i++) {
			boolean flag = true;
			//해당 위치에 퀸을 배치해본다.
			board[cdx] = i;
			for (int j = 0 ;j<cdx ; j++) {
				//퀸은 같은 열이면 안되고, 대각선에 있으면 안된다.
				if(board[cdx] == board[j]
						|| cdx - j == Math.abs(board[cdx] - board[j])) {
					flag = false;
					break;
				}
			}
			if(flag) {
				//다음 행에 퀸을 놓는 것을 진행
				nqeeun(cdx+1);
			}
		}
	}
}
