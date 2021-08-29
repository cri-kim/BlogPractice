package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여
 *  회의실 사용표를 만들려고 한다. 
 *  각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 
 *  각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자. 
 *  단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에
 *   다음 회의가 시작될 수 있다. 회의의 시작시간과 끝나는 시간이 같을 수도 있다. 
 *  이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.
 * */
public class Backjun1931 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			List<Meeting> g = new ArrayList<Meeting>();
			//회의의 수
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				String input = br.readLine();
				Meeting meeting = new Meeting();
				//시작시간
				meeting.start = Integer.parseInt(input.split(" ")[0]);
				//끝나는 시간
				meeting.end = Integer.parseInt(input.split(" ")[1]);
				g.add(meeting);
			}
			g = g.stream().sorted().map(m->m).collect(Collectors.toList());

			//회의의 갯수
			int cnt = 0;
			//끝 시간만 겹치는지 확인을 한다.
			int lastTime = 0;
			for(Meeting m : g) {
				if(lastTime <= m.start) {
					lastTime = m.end;
					cnt++;
				}
			}
			System.out.println(cnt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Meeting implements Comparable<Meeting>{
	public int start;
	public int end;
	
	@Override
	public int compareTo(Meeting o) {
		//종료시간이 같다면 시작시간이 빠른순 정렬
		if(this.end == o.end) {
			return Integer.compare(this.start, o.start);
		}
		//종료시간이 같지 않다면 종료시간이 빠른 순으로 정렬
		return Integer.compare(this.end, o.end);
	}
}
