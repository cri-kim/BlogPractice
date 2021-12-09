package array;
//모르겠다...
//힌트 읽고 16분
//힌트1 ( 현재 기준으로 양 옆의 가장 큰 값을 찾으세요)
//회고 1(DP 점화식)
public class LeetCode42 {
    public int trap2(int[] height) {
        int rs = 0;
        int n = height.length;
        int[][] dp = new int[n][2];

        if(n < 3){
            return 0;
        }
        dp[0][0] = height[0];//left
        dp[0][1] = height[0];//right
        for(int i=1;i<n;i++){
            dp[i][0] = Math.max(dp[i-1][0], height[i]);
            dp[i][1] = Math.max(heighestRight(height, i),height[i]);

            int min = Math.min(dp[i][0], dp[i][1])-height[i];
            System.out.println(dp[i][0]+","+dp[i][1]+","+min);
            rs += min > 0? min:0;
        }
        return rs;
    }

    public int trap(int[] height) {
        int rs = 0;
        int n = height.length;
        if(n < 3){
            return 0;
        }

        for(int i=0;i<n;i++){
            int hLeft = heighestLeft(height,i);
            int hRight = heighestRight(height,i);
            if(hLeft == 0 || hRight == 0){
                continue;
            }
            int h = Math.min(hLeft,hRight)-height[i];
            if(h >0)
            {
                rs += h;
            }
        }
        return rs;
    }
    public int heighestLeft(int[] height, int cur){
        int h = 0;
        for(int i=0;i<cur+1;i++){
           if( height[i] > h){
               h = height[i];
           }
        }
        return h == height[cur]?0:h;
    }
    public int heighestRight(int[] height, int cur){
        int h = 0;
        for(int i=cur+1;i<height.length;i++){
            if( height[i] > h){
                h = height[i];
            }
        }
        return h == height[cur]?0:h;
    }
}
