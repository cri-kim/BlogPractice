import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* *
 * 2020.11.12
 * 나동빈, 이것이 취업을 위한 코딩테스트다.
 * 미로탈출
 * 괴물o 0, 괴물x 1
 * limit : 30m
 * */
public class BFS_002 {

	private int n = 5; // Row count
	private int m = 6; // Col count
	private int[][] arr = { 
	  { 1, 0, 1, 0, 1, 0 }
	, { 1, 1, 1, 1, 1, 1 }
	, { 0, 0, 0, 0, 0, 1 }
	, { 1, 1, 1, 1, 1, 1 },
	  { 1, 1, 1, 1, 1, 1 } };
	//상하좌우
	private int[] dx = {-1,1,0,0};
	private int[] dy = {0,0,-1,1};
	
	public void solution() {
		int answer = 0;
		bfs(0,0);
		answer = arr[n-1][m-1];
		for(int i=0; i < n ; i++) {
			for(int j =0 ;j < m ; j ++) {
				System.out.print(arr[i][j] + "  ") ;
			}
			System.out.println();
		}
		System.out.println(answer);
	}
	public void bfs(int x, int y) {
		Queue<Position> q = new LinkedList();
		q.offer(new Position(x,y));
		
		while(!q.isEmpty()) {
			Position pos = q.poll();
			for(int i=0;i< dx.length;i++) {
				int nx = pos.getX() + dx[i];
				int ny = pos.getY() + dy[i];
				if(nx < 0 || nx >= n || ny < 0 || ny >=m) {
					continue;
				}
				if(arr[nx][ny] == 0) {
					continue;
				}
				if(arr[nx][ny] == 1) {
					arr[nx][ny] = arr[pos.getX()][pos.getY()] + 1;
					q.offer(new Position(nx, ny));
				}
			}
		}
	}

	//Inner class
	class Position {
		private int x;
		private int y;
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		Position(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}
