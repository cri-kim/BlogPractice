package dfs;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/* *
 * 2020.11.13 (실패 - 일주일뒤 다시 풀기)
 * 프로그래머스
 * 네트워크
 * = 그룹의 단위를 찾는 것
 * = Union Find(합집합 찾기), 서로 중복되지 않는 부분 집합들을 표현하는 알고리즘
 * *코드 참고 : https://velog.io/@ajufresh
 * 
 * ---
 * 오랜시간동안 풀지 못했다.
 * 근데 검색을 하다가 junit으로 테스트 한 코드를 보았다.
 * 왜 나는 이렇게 좋은 단위 테스트 도구가 있는데, 심지어 아는데 안썼을까?
 * ---
 * */
public class DFS_003 {
	public int solution(int n, int[][] computers) {
		int answer = 0;
		boolean[] check = new boolean[n]; // n 갯수만큼 boolean 배열을 만들고 모든 요소를 false로 초기화

		for (int i = 0; i < n; i++) {
			if (!check[i]) {
				dfs(computers, i, check);
				answer++;
			}
		}

		return answer;
	}

	boolean[] dfs(int[][] computers, int i, boolean[] check) {
		check[i] = true;

		for (int j = 0; j < computers.length; j++) {
			if (i != j && computers[i][j] == 1 && check[j] == false) {
				check = dfs(computers, j, check);
			}
		}
		return check;
	}
	  @Test
	  public void 정답() {
	    assertEquals(2, solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
	    assertEquals(1, solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
	  }
}
