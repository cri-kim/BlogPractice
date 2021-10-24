package learningtest.template;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
public class CalcSumTest {
    CalCultator cal;
    String numFilePath;
    @BeforeEach
    void setup(){
        cal = new CalCultator();
        numFilePath = getClass()
                .getResource("numbers.txt")
                .getPath();
    }
    @Test
    public void CalcSumTest() throws IOException {
        assertThat(cal.calcSum(this.numFilePath)).isEqualTo(10);
    }
}
