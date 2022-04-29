package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSampleTest {
    @Test
    void TestSampleT(){
        TestSample testSample = new TestSample();
        String[] result = testSample.sample2(new String[]{"2020-01-01 uid1000 pid5000"
                ,"2020-01-11 uid1000 pid5000"
                        ,"2020-01-09 uid1300 pid2000"
                        ,"2020-01-11 uid1300 pid2000"}
                , 10, "2020-01-11");
        for(String s : result)
        System.out.println(s);
    }
}
