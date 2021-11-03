package array;
//모르겠다...
//힌트 읽고 16분
//힌트 ( 현재 기준으로 양 옆의 가장 큰 값을 찾으세요)
public class LeetCode42 {
    public int trap(int[] height) {
        int rs = 0;
        int n = height.length;
        int[] dp = new int[n+1];
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
