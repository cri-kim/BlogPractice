import java.io.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Backjun1181 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			Set<String> set = new HashSet<>();
			for(int i=0;i<n;i++) {
				String input = br.readLine();
				set.add(input);
			}
			
			//사전순 정렬 후 length 정렬
			set.stream()
			.sorted()
			.sorted(Comparator.comparing(String::length))
			.forEach(System.out::println);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
