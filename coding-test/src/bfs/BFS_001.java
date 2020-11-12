package bfs;

import java.util.LinkedList;
import java.util.Queue;

/* *
 * 2020.11.11
 * 나동빈, 이것이 취업을 위한 코딩테스트다.
 * BFS(Breadth-First Search)
 * 너비 우선 탐색
 * 그래프에서 "가까운 노드"부터 우선적으로 탐색하는 알고리즘
 * 
 * 탐색시작 노드를 큐에 삽입하고 방문처리를 한다.
 * 큐에서 노드를 꺼낸 뒤 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리한다.
 * */
public class BFS_001 {
	int[][] graph = {
			{},{2,3,8},{1,7},{1,4,5},{3,5},{3,4},{7},{2,6,8},{1,7}
	};
	boolean [] visited = new boolean[graph.length];
	
	public void solution(){
		bfs(1);
	}
	public void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		while(!q.isEmpty()) {
			int v = q.poll();
			System.out.println(v + " ");
			
			for(int i=0; i< graph[v].length ; i++) {
				int j = graph[v][i];
				if(!visited[j]) {
					q.offer(j);
					visited[j] = true;
				}
			}
		}
	}
}
