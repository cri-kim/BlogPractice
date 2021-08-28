package mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 그래프가 주어졌을 때, 
 * 그 그래프의 최소 스패닝 트리를 구하는 프로그램을 작성하시오.

	최소 스패닝 트리는,
	 주어진 그래프의 모든 정점들을 연결하는 부분 그래프 중에서 
	 그 가중치의 합이 최소인 트리를 말한다.
 
	 첫째 줄에 정점의 개수 V(1 ≤ V ≤ 10,000)와
	  간선의 개수 E(1 ≤ E ≤ 100,000)가 주어진다. 
	  다음 E개의 줄에는 각 간선에 대한 정보를 나타내는 세 정수 A, B, C가 주어진다. 
	 이는 A번 정점과 B번 정점이 
	 가중치 C인 간선으로 연결되어 있다는 의미이다. 
	 C는 음수일 수도 있으며, 절댓값이 1,000,000을 넘지 않는다.
	
	그래프의 정점은 1번부터 V번까지 번호가 매겨져 있고, 
	임의의 두 정점 사이에 경로가 있다.
	 최소 스패닝 트리의 가중치가 -2,147,483,648보다 크거나 같고, 
	 2,147,483,647보다 작거나 같은 데이터만 입력으로 주어진다.
 * */
public class Backjun1197 {
	static int [] parent;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input = br.readLine();
			//1.정점의 개수
			int v = Integer.parseInt(input.split(" ")[0]);
			//2.간선의 개수
			int e = Integer.parseInt(input.split(" ")[1]);
			
			//3.부모 만듦
			parent = new int[v+1];
			for(int i=0 ; i < v+1 ; i++) {
				parent[i] = i;
			}
			//4. 그래프 값 초기화
			List<Edge> g = new ArrayList<Edge>();
			
			//5. 각 간선의 정보 입력(방향 X - 언급없음)
			for(int i=0 ; i< e ; i++) {
				String input2 = br.readLine();
				Edge edge = new Edge();
				edge.a = Integer.parseInt(input2.split(" ")[0]);
				edge.b = Integer.parseInt(input2.split(" ")[1]);
				edge.weight = Integer.parseInt(input2.split(" ")[2]);
				g.add(edge);
			}

			int min = 0;
			//6.오름차순 정렬
			g = g.stream().sorted().map(m->m).collect(Collectors.toList());
			
			for(Edge egde : g){
				//부모가 같지 않다면, 두 정점을 연결하고 가중치를 더한다.
				if(!sameParent(egde.a, egde.b)) {
					union(egde.a, egde.b);
					min += egde.weight;
				}
			}
			
			System.out.println(min);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//같은 부모를 가지고 있는지 판단
	public static boolean sameParent(int x, int y) {
		x = findParent(x);
		y = findParent(y);
		if(x == y) {
			return true;
		}
		return false;
	}
	//부모 찾기
	public static int findParent(int x) {
		if(parent[x] == x) {
			return x;
		}
		else {
			return parent[x] = findParent(parent[x]);
		}
	}
	//부모가 다른 경우 노드를 합쳐준다
	public static void union(int x, int y) {
		x = findParent(x);
		y = findParent(y);
		if(x != y) {
			parent[y] = x;
		}
	}
}
//간선
class Edge implements Comparable<Edge>{
	public int a;
	public int b;
	public int weight;
	
	@Override
	public int compareTo(Edge o) {
		//가중치 기준으로 오름차순
		return Integer.compare(this.weight, o.weight);
	}
}