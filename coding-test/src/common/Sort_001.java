package common;

import java.util.Arrays;

/* *
 * 2020.11.12
 * 나동빈, 이것이 취업을 위한 코딩테스트다.
 * 두 배열의 원소 교체 - A의 모든 원소의 합이 최대
 * limit : 15m
 * */
public class Sort_001 {
	private int[] a= {1,2,5,4,3};
	private int[] b = {5,5,6,6,5};
	private int n=5;
	private int k=3;//최대 바꿔치기 횟수
	
	public void solution() {
		int answer = 0;//A배열의 모든 원소의 합
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<n;i++) {
			if(i < k) {
				int indexB = n-i -1;
				if(a[i] < b[indexB]) {
					int temp = a[i];
					a[i] = b[indexB];
					b[indexB] = temp;
				}
			}
			answer += a[i];
		}
		
		System.out.println(answer);
	}
}
