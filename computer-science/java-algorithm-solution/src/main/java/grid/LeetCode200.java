package grid;

public class LeetCode200 {
    private char[][] grid;
    private int n;
    private int m;
    int num=0;
    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.n = grid.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1') {
                    searchland(i, j);
                    num++;
                }
            }
        }
        return num;
    }
    public void searchland(int i, int j){
        if(i == n || j == m || i < 0 || j <0 ||grid[i][j] == '0' ){
            return;
        }
        grid[i][j]='0';
        if (i> 0){
            searchland(i-1, j);
        }
        if(i< n-1){
            searchland(i+1,j);
        }
        if(j> 0){
            searchland(i,j-1);
        }
        if(j < m-1){
            searchland(i,j+1);
        }
    }
}
