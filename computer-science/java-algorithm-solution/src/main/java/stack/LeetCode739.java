
public class LeetCode739 {

    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] rs = new int[n];
        for(int i=0;i<n;i++){
            rs[i] = getWaitWarmerDay(temperatures,temperatures[i],i);
        }
        return rs;
    }
    public int getWaitWarmerDay(int[] temperatures, int temper, int s){
        int day = 0;
        for(int i=s;i<temperatures.length;i++,day++){
            if(temperatures[i] > temper){
                return day;
            }
        }
        return 0;
    }
}
