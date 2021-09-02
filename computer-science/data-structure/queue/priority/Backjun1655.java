package queue.priority;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * 시간초과 ㅜㅜ
 * */
public class Backjun1655 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			// 리스트 생성
			List<Integer> pq = new ArrayList<Integer>();
			// 백준이가 외치는 정수의 갯수
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				int input = Integer.parseInt(br.readLine());
				// 삽입시 순서정렬(오름차순)
				pq.add(input);

				// 백준이가 외친 수의 개수가 짝수개라면 중간에 있는 두 수 중에서 작은 수를 말해야 한다.
				int size = pq.size();
				int mid = size % 2 == 0 ? size / 2 - 1 : size / 2;
				Collections.sort(pq);
				bw.write(pq.get(mid) + "\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
