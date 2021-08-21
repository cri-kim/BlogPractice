package integer;

import org.junit.jupiter.api.Test;

/**
 * 264. Ugly Number II
 * An ugly number is a positive integer whose prime factors are limited to 2, 3,
 *  and 5.
 *  Given an integer n, return the nth ugly number.
 *  
 *  ugly number는 소인수 분해시 2,3,5로만 구성된 정수이다.
 *  정수 n이 주어졌을때 n 번째 ugly number를 구하여라
 *  1 <= n <=1690
 *  
 *   *시간제한 초과*
 *  
 * */
public class LeetCode264_2 {
	
	@Test
	public void test() {
		System.out.println(nthUglyNumber(1690));
	}

	public int nthUglyNumber(int n) {
		if(n == 1) {return n;}
		int number=1;
		int cnt = 1;
		while(n > cnt) {
			number++;
			if(isUgly(number)) {
				cnt++;
			}
		}
		
		return number;
	}
	
	//소인수 분해 원리로 2,3,5 만 약수로 갖었는지 확인
	public boolean isUgly(int n) {
		while(n % 2 == 0) {
			n /= 2;
		}
		while(n % 3 == 0) {
			n /= 3;
		}
		while(n % 5 == 0) {
			n /= 5;
		}
		
		if(n == 1) {
			return true;
		}
		return false;
	}
}
