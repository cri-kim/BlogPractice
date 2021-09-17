import java.io.*;

public class Backjun1012 {

	private static int[][] arr;
	private static int cnt;
	private static int n;
	private static int m;
	private static int area;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			//테스트 케이스 
			int t = Integer.parseInt(br.readLine());
			
			for(int test = 0 ; test < t ;test++) {
				String[] input = br.readLine().split(" ");
				//가로 길이
				m = Integer.parseInt(input[0]);
				//세로 길이
				n = Integer.parseInt(input[1]);
				//배추 갯수
				int k = Integer.parseInt(input[2]);
				//지렁이 수 초기화
				cnt = 0;
				//밭 초기화
				arr = new int[m][n];
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++) {
						arr[i][j] = 0;
					}
				}
	
				//배추 삽입
				for(int i=0;i<k;i++) {
					String[] input2 = br.readLine().split(" ");
					int x = Integer.parseInt(input2[0]);
					int y = Integer.parseInt(input2[1]);
					arr[x][y] = 1;
				}
				
				//DFS 탐색
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++) {
						area = 0;
						getEarthWormCnt(i,j);
						if(area > 0) {
							cnt++;
						}
					}
				}
				System.out.println(cnt);
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//지렁이 몇마리?
	public static void getEarthWormCnt(int x, int y) {
		//벽
		if(x > m-1 || y > n-1 || x <0 || y < 0 || arr[x][y] == 0) {
			return;
		}
		arr[x][y] = 0;
		area++;
		//상
		getEarthWormCnt(x-1,y);
		//하
		getEarthWormCnt(x+1,y);
		//좌
		getEarthWormCnt(x,y-1);
		//우
		getEarthWormCnt(x,y+1);
	}
}
/*
 *   0 1 2 3 4 5
 * 0     1
 * 1     1
 * 2     1
 * 3     1
 * 4 1
 * 5
 * 
 * */
