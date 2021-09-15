import java.io.*;
import java.util.Arrays;

public class Backjun2501 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String ip = br.readLine();
			int n = Integer.parseInt(ip.split(" ")[0]);
			int k = Integer.parseInt(ip.split(" ")[1]);
			int cnt = 0;
			for(int i=1;i<=n;i++) {
				if(n%i == 0) {
					cnt++;
				}
				if(cnt == k) {
					System.out.println(i);
					break;
				}
			}
			if(cnt < k ) {
				System.out.println("0");
			}
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void printThirdBigNumber(String target) {
		int [] arr=
		Arrays.asList(target.split(" ")).stream()
		.mapToInt(i->Integer.parseInt(i)).sorted().toArray();
		System.out.println(arr[7]);
		
	}
}

