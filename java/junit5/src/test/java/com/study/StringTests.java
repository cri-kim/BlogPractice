package com.study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/*
* title : String Test
* */
public class StringTests {

    @Test
    @DisplayName("문자열 1,2를 ,로 split 하면 1과 2로 분리되어야 한다.")
    void splitTest(){
        String str = "1,2";
        assertThat(str.split(","))
                .containsExactly("1","2");
        //containsExactly : 순서를 포함해서 정확히 일치
    }

    @Test
    @DisplayName("문자열 1을 ,로 split 하면 1로 분리되어야 한다.")
    void splitReturnTypeTest(){
        String str ="1";

        assertThat(str.split(","))
                .contains("1");
        //        .containsOnly("1");
        //containsOnly : 순서, 중복을 무시하는 대신 원소 값과 갯수가 정확히 일치
    }

    @Test
    @DisplayName("문자열 (1,2)에서 subString 으로 괄호를 제거하고 1,2를 반환한다.")
    void subStringTest(){
        String str ="(1,2)";
        assertThat(str.substring(1, str.length()-1)).isEqualTo("1,2");
    }

    @ParameterizedTest
    @MethodSource("getSelectedChar")
    @DisplayName("charAt을 활용하여 특정 위치의 문자를 가져온다.")
    void getSelectedChar(int idx, char ch){
        String str = "abc";
        assertThat(str.charAt(idx)).isEqualTo(ch);
    }

    //@MethodSource
    //value에 method 명시가 없을 겨우 테스트 메소드와 이름잉 동일한 메소드를 활용
    //factory 메소드가 리턴해 주는 갑승ㄹ 가지고 반복 테스트
    //factory 메소드 : static, 인자 x, Stream  타입으로 return
    static Stream<Arguments> getSelectedChar(){
        return Stream.of(
                Arguments.of(0, 'a'),
                Arguments.of(1, 'b'),
                Arguments.of(2, 'c')
        );
    }

    @Test
    @DisplayName("StringIndexOutOfBoundsException 에 대한 학습 테스트를 구현한다.")
    void isError(){
        String str = "abc";
        //assertThatThrownBy : 예외처리를 가독성 있게 테스트할 수 있는 함수가 제공ㅇ된다.
        assertThatThrownBy(() -> str.charAt(str.length()))
          .isInstanceOf(IndexOutOfBoundsException.class)
          .hasMessageContaining("String index out of range: 3");
    }
}