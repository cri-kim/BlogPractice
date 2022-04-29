package array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class TestSample {
    public int sample1(int[][] s){
        int answer=0;
        int[][] match = new int[1001][1001];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<s.length;i++){
            int source = s[i][0];
            int target = s[i][1];
            match[source][target] = -1;
            if(match[target][source] == -1){
                answer++;
            }
        }
        return answer;
    }

    private final static String PREFIX_USER_ID= "uid";
    private final static String PREFIX_PRODUCT_ID="pid";
    private final static String DETERMITER = " ";
    public String[] sample2(String[] records, int k, String date){
        String[] answer = {};
        int[][] repurchaseCnt = new int[10001][10001];
        Set<Integer> saledProducts = new HashSet<>();
        Map<Integer,Double> map = new HashMap<>();

        for(int i=0;i<records.length;i++){
            String[] recordArr = records[i].split(DETERMITER);
            String buyDate = recordArr[0];
            int userId = Integer.parseInt(recordArr[1].replace(PREFIX_USER_ID,""));
            int productId = Integer.parseInt(recordArr[2].replace(PREFIX_PRODUCT_ID,""));

            if(!compareDate(date, buyDate, k)){
                continue;
            }
            repurchaseCnt[productId][userId] = repurchaseCnt[productId][userId]+1;
            saledProducts.add(productId);
        }
        for(Integer productId : saledProducts){
            double rate = getRepurchaseRate(repurchaseCnt[productId]);
            if(rate > 0) {
                map.put(productId, rate);
            }
        }
        if(map.size() == 0){
            return new String[]{"no result"};
        }
        List<Integer> temp = new ArrayList<>(map.keySet());
        Collections.sort(temp, (s1, s2)->map.get(s2).compareTo(map.get(s1)));
        List<String> list = new ArrayList<>();
        for(Integer l:temp){
            list.add(PREFIX_PRODUCT_ID+l);
        }

        return list.toArray(new String[list.size()]);
    }

    private double getRepurchaseRate( int[] clients){
        int cCnt = 0;
        int rCnt = 0;
        for(int i=1;i<clients.length;i++){
            if(clients[i] > 0){
                rCnt ++;
            }
            if(clients[i] > 1){
                cCnt++;
            }
        }
        if(cCnt == 0) return 0;
        return cCnt/rCnt * 100;
    }

    private boolean compareDate(String source, String target, int k) {
        try {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date sourceDate =  sdf.parse(source);
        Date startDate = calculateDate(sourceDate,k * -1);
        Date endDate = calculateDate(sourceDate, k);
        Date tDate = sdf.parse(target);

        if(tDate.after(endDate) ) {
            return false;
        }
        if(tDate.before(startDate)){
            return false;
        }
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    private Date calculateDate(Date source, int k){
        Calendar cal = Calendar.getInstance();
        cal.setTime(source);
        cal.add(Calendar.DATE, k);
        return cal.getTime();
    }
}