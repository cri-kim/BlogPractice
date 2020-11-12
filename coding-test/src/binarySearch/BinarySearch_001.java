package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/* *
 * 2020.11.12
 * 나동빈, 이것이 취업을 위한 코딩테스트다.
 * 떡볶이 떡만들기
 * limit : 40m
 * */
public class BinarySearch_001 {
	private int m = 50000000;
	private int[] riceCakes = { 1000000000,3,2 };
	private int answer;

	public void solution() {
//		int answer = 0;
		int len = riceCakes.length;
		Arrays.sort(riceCakes);//오름차순 정렬
//		answer = maxH( 0);
		findMaxHByBinarySearch(0, riceCakes[len-1]);
		
		System.out.println(this.answer);
	}
	/* 중간점을 높이로 하여 작성 */
	public void findMaxHByBinarySearch(int start, int end) {
		if(start >= end) return;
		
		int mid = (end + start) / 2;
		int sum = IntStream.of(riceCakes).filter(v-> v-mid > 0).map(v-> v-mid).sum();
		
		if(sum >= m) {
			findMaxHByBinarySearch(mid+1, end);
		} else {
			findMaxHByBinarySearch(start, mid);
		}
		answer = mid;
	}
	
	//단순탐색 - 시간초과
	public int maxH(int h) {
		int maxH = h;
		int sum = 0;
		
		while(h < riceCakes[riceCakes.length-1]) {
			for(int i=0; i<riceCakes.length ; i++){
				int cut = riceCakes[i] - h;
				if(cut > 0) {
					sum+=cut;
				}
			}
			if(sum >= m) {
				if(maxH < h) {
					maxH = h;
				}
			}else {
				break;
			}
			h++;
			sum=0;
		}
		return maxH;
	}
}
