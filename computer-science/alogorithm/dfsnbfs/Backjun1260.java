package dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
 * 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
 * */
public class Backjun1260 {
	
	public static boolean visited[];
	public static boolean visited2[];
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			//1. 정점의 개수 n, 간선의 개수 m, 탐색 시작할 정점 번호 v
			String[] arr = br.readLine().split(" ");
			int n = Integer.valueOf(arr[0]);
			int m = Integer.valueOf(arr[1]);
			int v = Integer.valueOf(arr[2]);
			
			int[][] graph = new int[n+1][n+1];
			visited = new boolean[n+1];
			visited2 = new boolean[n+1];
			
			//2. 그래프 생성
			for(int  i=0 ; i< n+1 ;i++) {
				for( int j =0 ; j< n+1; j++) {
					graph[i][j] = 0;
				}
			}
			
			for(int i= 0 ; i < m ; i++) {
				//3. 정점 사이의 간선 입력
				String[] edge = br.readLine().split(" ");
				int x = Integer.valueOf(edge[0]);
				int y = Integer.valueOf(edge[1]);
				graph[x][y] = 1;
				graph[y][x] = 1;
				
			}
			dfs(graph,n,m,v);
			System.out.println();
			bfs(graph,n,m,v);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void dfs(int[][] graph, int n, int m, int v) {
		//방문한 노드 체크
		visited[v] = true;
		System.out.print(v+" ");
		for(int i=1;i<n+1;i++) {
			//방문한 노드 혹은 간선이 없는 경우, 다음깊이 노드 확인
			if(visited[i] || graph[v][i] == 0) {
				continue;
			}
			//방문하지 않은 노드일 경우, 
			dfs(graph, n, m, i);
		}
	}
	public static void bfs(int[][] graph, int n, int m, int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		//방문한 노드 추가
		q.offer(v);
		//방문한 노드 체크
		visited2[v] = true;
		System.out.print(v +" ");
		
		while(!q.isEmpty()) {
			//방문한 노드 출력 및 빼기
			v = q.poll();
			
			//해당 방문한 노드의 주변 탐색
			for(int i=1;i<=n;i++) {
				if(visited2[i] || graph[v][i] ==0) {
					continue;
				}
				//방문한 노드의 주변에 방문하지 않은 노드가 있으면 queue에 삽입
				q.offer(i);
				//노드 방문 처리
				visited2[i] = true;
				System.out.print(i +" ");
			}
		}
	}
}
/*
 *   1 2 3 4
 * 1 0 1 1 1
 * 2 1 0 0 1
 * 3 1 0 0 1 
 * 4 1 1 1 0
 * */