package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

/*
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 
 *<< 속도의 문제 >>
 * - 출력시 bufferedwriter
 * - 입력시 bufferedreader
 * 사용의 효율
 * */
public class Backjun2751_1 {
	@Test
	public void test() {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<100000;i++) {
			list.add(i);
		}
		Collections.sort(list);
	}

	public static void main(String[] args) {
		 execute2();
	}
	
	public static void execute() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		try {
			// 1. N개의 수 지정
			String in = br.readLine();
			int n = Integer.valueOf(in);

			// 2. N개의 수를 입력 받는다.
			for (int i = 0; i < n; i++) {
				int number = Integer.parseInt(br.readLine());
				list.add(number);
			}
			
			Collections.sort(list);
			for(int i=0;i<n;i++) {
				System.out.println(list.get(i));
			}
			//mergeSort(arr, 0, arr.length-1, arr2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void execute2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			// 1. N개의 수 지정
			String in = br.readLine();
			int n = Integer.valueOf(in);
			Integer[] arr = new Integer[n];

			// 2. N개의 수를 입력 받는다.
			for (int i = 0; i < n; i++) {
				arr[i]=Integer.parseInt(br.readLine());
			}
			Arrays.sort(arr);
			StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            sb.append(arr[i] + "\n");
	        }
	        bw.write(sb.toString());
	        bw.flush();
	        bw.close();
	        br.close();
			//mergeSort(arr, 0, arr.length-1, arr2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
