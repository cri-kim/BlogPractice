package common;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/*
 * 2020.11.18, 11.20
 * codeup
 * */
public class Greedy_001 {
	public void solution() {
	}
	
	public String question_2001(int[] pastaPrice, int[] juicePrice) {
		// 1set = pates 3, juice 2
		double min = (2000 + 2000) * 10; //max value
		
		for(int i=0;i<pastaPrice.length;i++) {
			for(int j=0;j<juicePrice.length;j++) {
				double setPrice = (pastaPrice[i] + juicePrice[j]) * 1.1;
				if(setPrice < min) {
					min = setPrice;
				}
			}
		}
		return String.format("%.1f", min);
	}
	
	@Test
	public void 정답_2001() {
		assertEquals("987.8", question_2001(new int[]{800,700,900}, new int[]{198,330}));
	}
	public String question_3120(int a, int b) {
		String answer ="";
		int value = 0;
		int cnt = 0;
		// buttons 1, -1, 5, -5, 10, -10
		List<Integer> values;
		Comparator<Integer> comp = (v1, v2) -> Integer.compare(Math.abs(b-v1), Math.abs(b-v2));
		while(true) {
			if(a == b) {
				break;
			}
			if(cnt == b) {
				break;
			}
			values = new ArrayList<Integer>();
			values.add(a+1);
			values.add(a+5);
			values.add(a+10);
			values.add(a-1);
			values.add(a-5);
			values.add(a-10);
			value = values.stream().min(comp).get();
			a = value;
			cnt++;
		}
		answer = String.valueOf(cnt);
		return answer;
	}
	@Test
	public void 정답_3120() {
		assertEquals("4",question_3120(0,40));
	}
	
	public int question_3301(int n) {
		int answer = 0;
		if(n > 50000) {
			answer += n/50000;
			n = n%50000;
		}

		if(n > 1000) {
			answer += n/1000;
			n = n%1000;
		}

		if(n > 500) {
			answer += n/500;
			n = n%500;
		}

		if(n > 10) {
			answer += n/10;
			n = n%10;
		}
		return answer;
	}
	@Test
	public void 정답_3301() {
		assertEquals(8,question_3301(54520));
	}
	
	//토핑의 종류, 도우의 가격, 토핑의 가격, 도우의 칼로리, 토핑의 칼로리들(n개)
	//1달러당 열량의 수
	public int question_3321(int n, int a, int b, int c, int[] di) {
		int answer = 0;
		int price = a; //총계
		int cal = c; // 칼로리
		di = IntStream.of(di).sorted().toArray();
		for(int i=n-1;i >= 0 ;i--) {
			answer = cal/price;
			if(answer > di[i]/b) {
				break;
			}
			price += b;
			cal += di[i];
		}
		answer = cal/price;
		return answer;
	}
	
	@Test
	public void 정답_3321() {
		assertEquals(37,question_3321(3,12,2,200,new int[] {50,300,100}));
	}
	
	//n일의 성수기 기간, m 개의 방
	//s 펜션 도착일, t 펜션 떠나는날
	public int question_4040(int n, int m, String[] arr, int s, int t) {
		int answer = 0;
		while(true) {
			if(answer > t) break;
			int max = 0;
			for(int i=0;i<m;i++) {
				String room = arr[s-1];
				if(room.contains("O")) {
					int cnt = 1;
				}
			}
		}
		return answer;
	}
	@Test
	public void 정답_4040() {
		assertEquals(37,question_4040(10,7,new String[] {"XXXXXXX"
				,"XOXXXXO"				,"XOXXXXO"				,"XOXXXOX"				,"OXXOXOX"
				,"XOXOXOX"				,"OXXOXOX"				,"OXXXXOX"				,"XXXXXXX"
				,"XXXXXXX"},2,9));
	}
	
}
