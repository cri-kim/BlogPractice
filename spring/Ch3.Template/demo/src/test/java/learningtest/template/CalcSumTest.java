package learningtest.template;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
public class CalcSumTest {
    @Test
    public void CalcSumTest() throws IOException {
        CalCultator cal = new CalCultator();
        int sum = cal.calcSum(getClass()
                .getResource("numbers.txt")
                .getPath());
        assertThat(sum).isEqualTo(10);
    }
}
