package bruteforce;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Goorm_hamburgerTest {
    @Test
    public void getLunchTimeTest(){
        Goorm_hamburger test = new Goorm_hamburger();
        int s = 3;
        List<LunchTime> times = new ArrayList<>();
        String e = "1 2 3";
        String c = "1 2 1";
        for(int i=0;i<s;i++){
            LunchTime time = new LunchTime(Integer.parseInt(e.split(" ")[i])
                    , Integer.parseInt(c.split(" ")[i]));
            times.add(time);
        }

        assertEquals(test.getLunchTime(s, times), 5);

    }
}
