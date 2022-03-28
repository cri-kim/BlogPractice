package bruteforce;

import java.util.Collections;
import java.util.List;
public class Goorm_hamburger {

    private int lunchTime;
    public int getLunchTime( int cnt ,List<LunchTime> times){
        //int lunchTime = 0;
        int curTime = 0;

        Collections.reverse(times);
        lunchTime = 0;

        for(int i=0; i< cnt;i++){
            LunchTime time = times.get(i);
            curTime += time.getCookTime();
            int temp = curTime + time.getEatenTime();
            if(temp > lunchTime){
                lunchTime = temp;
            }
        }

        return lunchTime;
    }
}
class LunchTime implements Comparable<LunchTime>{
    private int eatenTime;
    private int cookTime;

    public int getEatenTime(){
        return eatenTime;
    }
    public int getCookTime(){
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public void setEatenTime(int eatenTime) {
        this.eatenTime = eatenTime;
    }

    public LunchTime(int eatenTime, int cookTime){
        this.eatenTime = eatenTime;
        this.cookTime = cookTime;
    }

    @Override
    public int compareTo(LunchTime o) {
        return eatenTime < o.getEatenTime() ? 1 : -1;
    }
}