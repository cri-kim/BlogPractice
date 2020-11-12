package dfs;

/* *
 * 2020.11.11
 * 나동빈, 이것이 취업을 위한 코딩테스트다.
 * 음료수 얼려먹기 문제
 * limit : 30m
 * */
public class DFS_002 {
	int n = 4; // 얼음틀 세로
	int m = 5; // 얼음틀 가로
	int[][] ices = { { 0, 0, 1, 1, 0 }, { 0, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };
	int cnt = 0;
	
	public void solution() {
		int answer = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				getIceCream(i,j);
				if(cnt > 0) {
					answer++;
					cnt=0;
				}
			}
		}
		System.out.println(answer);
	}

	public void getIceCream(int i, int j) {
		if(ices[i][j] == 1) return;
		
		ices[i][j] = 1;
		/*동북서남 탐색*/
		if(j > 0)
			getIceCream(i,j-1);
		if(i >0)
			getIceCream(i-1,j);
		if(j < m-1)
			getIceCream(i,j+1);
		if(i < n-1)
			getIceCream(i+1,j);
		cnt++;
	}
}
