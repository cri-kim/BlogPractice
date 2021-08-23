package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

/*
 * 
 * 합병 정렬 - 시간초과
 * 퀵 정렬 - 시간초과
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * */
public class Backjun2751 {
	private static int[] arr;
	@Test
	public void test() {
		arr = new int[6];
		int[] arr2 = new int[6];
		arr[0] = 5;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 101;
		arr[5] = 1;
		mergeSort(arr, 0, arr.length-1, arr2);
		print( arr);
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			// 1. N개의 수 지정
			String in = br.readLine();
			int n = Integer.valueOf(in);
			arr = new int[n];
			int[] arr2 = new int[n];

			// 2. N개의 수를 입력 받는다.
			for (int i = 0; i < n; i++) {
				String in2 = br.readLine();
				int number = Integer.valueOf(in2);
				arr[i] = number;
			}
			//mergeSort(arr, 0, arr.length-1, arr2);
			quickSort(arr, 0, arr.length-1);
			print( arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* 합병 정렬 */
	public static void mergeSort(int[] arr, int s, int e, int[] arr2) {
		if (s >= e)
			return;

		// 1. 분할 (divide)
		int mid = (s+e) / 2;

		// 2.정복 ( conquer)
		mergeSort(arr, s, mid, arr2);
		mergeSort(arr, mid + 1, e, arr2);

		// 3. 결합(combine)
		int i = s, j = mid + 1, k = s;
		for (; k <= e; ++k) {
			if (j > e)
				arr2[k] = arr[i++];
			else if (i > mid)
				arr2[k] = arr[j++];
			else if (arr[i] <= arr[j])
				arr2[k] = arr[i++];
			else
				arr2[k] = arr[j++];
		}
		for (i = s; i <= e; ++i) {
			arr[i] = arr2[i];
		}
	}
	/* 퀵정렬 */
	public static void quickSort(int[] arr, int left, int right) {
		int i,j,pivot, temp;
		if(left < right) {
			i = left; j=right;
			pivot = arr[(left + right)/2];
			while(i<j) {
				while(arr[j] > pivot) j--;
				while(i < j && arr[i] < pivot) i++;
				
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			quickSort(arr, left, i-1);
			quickSort(arr, i+1, right);
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
