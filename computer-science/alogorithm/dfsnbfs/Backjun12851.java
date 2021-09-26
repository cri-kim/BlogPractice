package dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
 * title: 숨바꼭질2
 * */
public class Backjun12851 {
	public static Queue<CNode> q = new LinkedList<CNode>();
	public static boolean[] visited = new boolean[100001];
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			int n = Integer.parseInt(input.split(" ")[0]);
			int k = Integer.parseInt(input.split(" ")[1]);
			int fastTime = 0;
			int fastCnt = 0;
			if(n == k) {
				fastTime = 0;
				fastCnt = 1;
			}
			else {
				//수빈이의 위치를 넣는다.
				CNode node = new CNode(n, 0);
				q.offer(node);
				visited[n]=true;
				
				while(!q.isEmpty()) {
					node = q.poll();
					visited[node.element]=true;
					
					if(fastCnt > 0 && node.level == fastTime && node.element == k) {
						fastCnt++;
					}

					if(fastCnt == 0 && node.element == k) {
						fastCnt++;
						fastTime = node.level;
					}
					
					valid(node.element-1, node.level+1);
					valid(node.element+1, node.level+1);
					valid(node.element*2, node.level+1);
				}
			}
			System.out.println(fastTime);
			System.out.println(fastCnt);
			
		} catch (NumberFormatException | IOException e) {
		}
	}
	public static boolean findSister(int k, int l) {
		if(k == l) {
			return true;
		}
		return false;
	}
	public static void valid(int element, int level) {
		if(element >= 0 && element<= 100000 && !visited[element]) {
			CNode node = new CNode(element, level);
			q.offer(node);
		}
	}
}
class CNode{
	int element;
	int level;
	
	public CNode(int e, int l) {
		element = e;
		level = l;
	}
}