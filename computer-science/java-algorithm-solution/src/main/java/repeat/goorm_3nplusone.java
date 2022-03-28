package repeat;
//우박수
public class goorm_3nplusone {
    public int soluton(int num){
        int answer = 0;
        long result = num;
        while(result != 1){
            answer ++ ;
            if(answer > 500) return -1;
            result = (result %2==0)?result / 2 : result * 3 + 1;
        }
        return answer;
    }
}
