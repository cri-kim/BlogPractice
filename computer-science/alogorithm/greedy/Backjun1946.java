import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//최대인원수를 뽑아야함
public class Backjun1946 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			//테스트 케이스의 개수
			int t = Integer.parseInt(br.readLine());
			
			for(int c = 0 ; c<t ; c++) {
				//지원자 숫자
				int n = Integer.parseInt(br.readLine());
				List<Score> scores = new ArrayList<Score>();
				for(int i=0;i<n;i++) {
					//지원자의 서류심사 성적, 면접 성적의 순위
					String input = br.readLine();
					int doc = Integer.parseInt(input.split(" ")[0]);
					int iv = Integer.parseInt(input.split(" ")[1]);
					Score score = new Score(doc, iv);
					scores.add(score);
				}
				scores = scores.stream().sorted().map(m->m).collect(Collectors.toList());
				
				int interview = scores.get(0).interview;
				int cnt = 1;
				for(int i=1;i<n;i++) {
					if(interview > scores.get(i).interview) {
						cnt++;
						interview = scores.get(i).interview;
					}
				}
				System.out.println(cnt);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
}

class Score implements Comparable<Score>{
	public int document;
	public int interview;
	public Score(int d, int i) {
		document = d;
		interview = i;
	}
	@Override
	public int compareTo(Score o) {
		if(document == o.document) {
			return Integer.compare(this.interview, o.interview);
		}
		return Integer.compare(this.document, o.document);
	}
}