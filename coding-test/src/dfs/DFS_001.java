package dfs;

/* *
 * 2020.11.11
 * 나동빈, 이것이 취업을 위한 코딩테스트다.
 * DFS(Depth-First Search)
 * 깊이 우선 탐색
 * 
 * 스택 자료구조(혹은 재귀함수)를 이용하여 동작
 * 1.탐색 시작 노드를 스택에 삽입하고 방문처리를 한다.
 * 2. 매번 최상단 노드 기준으로, 방문하지 않은 노드가 있으면 방문처리를 한다.
 * */
public class DFS_001 {
	int[][] graph = {
			{},{2,3,8},{1,7},{1,4,5},{3,5},{3,4},{7},{2,6,8},{1,7}
	};
	boolean [] visited = new boolean[graph.length];
	
	public void solution(){
		int answer = 0;

		dfs( 1);
//		System.out.println(answer);
	}
	
	public void dfs( int v) {
		visited[v] = true;
		System.out.print(v+" ");
		for(int i = 0 ;i< graph[v].length;i++) {
			int j = graph[v][i];
			if(!visited[j]) {
				dfs(j);
			}
		}
	}
}
