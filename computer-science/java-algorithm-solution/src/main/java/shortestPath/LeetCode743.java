package shortestPath;

import java.util.*;

//30분 고민하다 못품
//방향 그래프
public class LeetCode743 {
        class Pair {
            int x;
            int y;

            Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        private final List<List<Pair>> graph = new ArrayList<>();
        private int[] cache;

        public int networkDelayTime(int[][] times, int n, int k) {
            //빈 그래프 생성
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            //위치로 가는 값이 없을 경우, -1 을 반환하도록 값을 채운다
            cache = new int[n];
            Arrays.fill(cache, -1);

            //방향과 값을 넣는다.
            for (int[] time : times) {
                int u = time[0] - 1;
                int v = time[1] - 1;
                int w = time[2];
                graph.get(u).add(new Pair(v, w));
            }

            //bfs탐색
            bfs(k - 1);

            int answer = 0;
            for (int i = 0; i < n; i++) {
                if (cache[i] == -1) return -1;
                answer = Math.max(answer, cache[i]);
            }
            return answer;
        }

        private void bfs(int x) {
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(x, 0));
            while (!q.isEmpty()) {
                Pair p = q.poll();

                //벙문하지 않은 노드(-1) 이거나, path가 이전 경로에서 크거나 같은 경우, 탐색하지 않는다.
                if (cache[p.x] != -1 && p.y >= cache[p.x]) {
                    continue;
                }
                cache[p.x] = p.y;

                for (Pair np : graph.get(p.x)) {
                    q.add(new Pair(np.x, p.y + np.y));
                }
            }
        }
}
