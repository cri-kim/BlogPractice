package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode937 {
    public String[] reorderLogFiles(String[] logs) {
        List<Log> letters = new ArrayList<>();
        List<Log> digits = new ArrayList<>();
        for(String log : logs){
            Log newLog = new Log(log);
            if(newLog.isDigit()){
                digits.add(newLog);
            }
            else{
                letters.add(newLog);
            }
        }
        Collections.sort(letters);
        List<String> rs = new ArrayList<>();
        for(Log log : letters){
            rs.add(log.defaultString);
        }
        for(Log log : digits){
            rs.add(log.defaultString);
        }

        return rs.toArray(new String[rs.size()]);
    }
}
class Log  implements Comparable<Log>{
    private static final String DELIMETER = " ";
    String[] values;
    String defaultString;
    String id;
    boolean isDigit=false;

    public Log(String defaultString){
        this.defaultString = defaultString;
        this.values = defaultString.split(DELIMETER);
        this.id = values[0];
    }

    @Override
    public int compareTo(Log o) {
        if(isDigit && o.isDigit) {
            return 0;
        }
        if(getContents().equals(o.getContents())){
            return String.CASE_INSENSITIVE_ORDER.compare(id, o.id);
        }
        return String.CASE_INSENSITIVE_ORDER.compare(getContents()
                , o.getContents());
    }
    public String getContents(){
        return String.join(" "
                ,Arrays.copyOfRange(values, 1, values.length));
    }

    public boolean isDigit() {
        try {
            Double.parseDouble(getContents().trim());
        } catch (NumberFormatException e){
            return false;
        }
        isDigit = true;
        return true;
    }
}