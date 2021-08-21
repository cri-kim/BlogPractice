package integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
 *  
 * */
public class LeetCode264 {
	
	@Test
	public void test() {
		System.out.println(nthUglyNumber(10));
	}


	public int nthUglyNumber(int n) {
		int ugly[] = new int[n];
		int i2 = 0, i3=0, i5=0;
		
		int n2=2;
		int n3=3;
		int n5=5;
		
		int number = 1;
		ugly[0] = 1;
		
		for(int i=1;i<n ;i++) {
			number = Math.min(n2, Math.min(n3,n5));
			
			ugly[i] = number;
			if(number == n2) {
				i2++;
				n2 = ugly[i2] * 2;
			} 
			
			if(number == n3) {
				i3++;
				n3 = ugly[i3] * 3;
			}
			if(number == n5) {
				i5++;
				n5 = ugly[i5] * 5;
			}
		}
		return number;
	}
	
}
