package binarySearch;

import java.util.stream.IntStream;

/* *
 * 2020.11.12
 * 나동빈, 이것이 취업을 위한 코딩테스트다.
 * 정렬된 배열에서 특정 수의 개수 구하기
 * limit : 30m
 * */
public class BinarySearch_002 {
	
	public void solution() {
		int n = 9;
		int x = 2;
		int[] arr = { 1, 1, 2, 2, 2, 2, 2, 2,  3 };
		System.out.println(findCount(arr,x));
	}
	
	
	/*
	 * Stream 으로 바로 처리가 되어버린다.
	 * ...binary는?
	 * */
	public int findCount(int[] arr, int x) {
		return (int) IntStream.of(arr).filter(v -> v == x).count();
	}
}
