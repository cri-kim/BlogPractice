package grid;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

//다시 풀어봐야할듯...
public class LeetCode207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList();
        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }

        
        for(int[] edge: prerequisites){
            indegree[edge[0]]++;
            adjList.get(edge[1]).add(edge[0]);
        }


        return false;
    }
}
