import java.io.*;
import java.util.Arrays;

public class Backjun2693 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				String target = br.readLine();
				printThirdBigNumber(target);
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

