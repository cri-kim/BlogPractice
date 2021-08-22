package dfsnbfs;

import org.junit.jupiter.api.Test;

public class BackjunTests1260 {


	@Test
	public void test() {
		Backjun1260 back = new Backjun1260();
		
		int n=4;
		int m=5;
		int v=1;
		int[][] graph = new int[n+1][n+1];
		for(int  i=0 ; i< n+1 ;i++) {
			for( int j =0 ; j< n+1; j++) {
				graph[i][j] = 0;
			}
		}
		back.visited = new boolean[n+1];
		back.visited2 = new boolean[n+1];
		
		graph[1][2]=1;
		graph[1][3]=1;
		graph[1][4]=1;
		graph[2][4]=1;
		graph[3][4]=1;
		back.dfs(graph,n,m,v);
		System.out.println();
		back.bfs(graph,n,m,v);
	}

	@Test
	public void test2() {
		System.out.println();
		Backjun1260 back = new Backjun1260();
		
		int n=5;
		int m=5;
		int v=3;
		int[][] graph = new int[n+1][n+1];
		for(int  i=0 ; i< n+1 ;i++) {
			for( int j =0 ; j< n+1; j++) {
				graph[i][j] = 0;
			}
		}
		back.visited = new boolean[n+1];
		back.visited2 = new boolean[n+1];
		
		graph[5][4]=1;
		graph[5][2]=1;
		graph[1][2]=1;
		graph[3][4]=1;
		graph[3][1]=1;
		back.dfs(graph,n,m,v);
		System.out.println();
		back.bfs(graph,n,m,v);
	}
}
