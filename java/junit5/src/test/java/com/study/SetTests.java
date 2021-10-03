package com.study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.*;
/*
 * title : Set Test
* ref : https://www.baeldung.com/parameterized-tests-junit-5
* */
public class SetTests {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @DisplayName("numbers의 크기는 3이다.")
    @Test
    void checkSetSize(){
        assertThat(numbers).hasSize(3);
    }

    @DisplayName("특정 위치에 값이 존재하는지 확인한다.")
    @ParameterizedTest
    @CsvSource(value = {"-1,false","1,true","2,true","3,true","4,false","5,false"}, delimiter = ',')
    void contains(int number, boolean bool){
        assertThat(numbers.contains(number)).isEqualTo(bool);
    }
}
