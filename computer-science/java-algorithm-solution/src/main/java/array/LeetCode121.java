package array;

import java.util.Arrays;
// 7분
// 다른 내용 참고
public class LeetCode121 {
    public int maxProfitTime(int[] prices ) {
        int n= prices.length;
        if(n == 0 ){
            return 0;
        }
        int[] dp = new int[n];
        int max = 0;
        int min = prices[0];
        for(int i=1;i<n;i++){
            min = Math.min(min, prices[i]);
            dp[i] =prices[i] - min;
            if(dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }
    public int maxProfitTimeLimitted(int[] prices) {
        int profit = 0;
        for(int i=0;i<prices.length-1;i++){
            int priceOfStock = prices[i];
            int priceOfSell = Arrays.stream(Arrays.copyOfRange(prices,i+1, prices.length)).max().getAsInt();
            if(priceOfSell - priceOfStock > profit){
                profit = priceOfSell - priceOfStock;
            }
        }
        return profit;
    }
}
