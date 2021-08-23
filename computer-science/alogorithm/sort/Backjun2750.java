package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

/*
 * 선택정렬, 삽입정렬 사용
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * */
public class Backjun2750 {
	@Test
	public void test() {
		int[] arr = new int[6];
		arr[0] = 5;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 101;
		arr[5] = 1;
		
		insertSort(arr);
	}
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			//1. N개의 수 지정
			String in = br.readLine();
			int n = Integer.valueOf(in);
			int[] arr = new int[n];
			
			//2. N개의 수를 입력 받는다.
			for(int i=0;i<n;i++) {
				String in2 = br.readLine();
				int number = Integer.valueOf(in2);
				arr[i] = number;
			}
			selectionSort(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/* 선택 정렬 */
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min = i;
			for(int j=i;j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		print(arr);
	}
	/* 삽입 정렬 */
	public static void insertSort(int[] arr) {
		for(int i=1;i<arr.length ;i++) {
			int temp = arr[i];
			int idx = i -1;
			//정렬된 배열 부분과 비교하여 위치 삽입
			while((idx >=0 )&& (arr[idx] > temp)) {
				arr[idx + 1] = arr[idx];
				idx --;
			}
			arr[idx+1] = temp;
		}
		print(arr);
	}
	
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
