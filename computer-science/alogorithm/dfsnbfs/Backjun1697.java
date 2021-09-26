package dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*
 * title : 숨바꼭질
 * 0 <= n(수빈) <= 100000
 * 0 <= k(동생) <= 100000 
 * */
public class Backjun1697 {
	public static Queue<Node> q = new LinkedList<Node>();
	public static boolean[] visited = new boolean[100001];
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			int n = Integer.parseInt(input.split(" ")[0]);
			int k = Integer.parseInt(input.split(" ")[1]);
			int seconds = 0;
			if(n == k) {
				seconds = 0;
			}
			else {
				
				//수빈이의 위치를 넣는다.
				Node node = new Node(n, 0);
				q.offer(node);
				visited[n]=true;
				
				while(!q.isEmpty()) {
					node = q.poll();
					int level = node.level + 1;
					seconds = level;
					
					if(findSister(k, node.element-1)) {
						break;
					}
					valid(node.element-1, level);
					
					if(findSister(k, node.element+1)) {
						break;
					}
					valid(node.element+1, level);

					if(findSister(k, node.element*2)) {
						break;
					}
					valid(node.element*2, level);
				}
			}
			System.out.println(seconds);
			
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
			Node node = new Node(element, level);
			q.offer(node);
			visited[element]=true;
		}
	}
}
class Node{
	int element;
	int level;
	
	public Node(int e, int l) {
		element = e;
		level = l;
	}
}
