import java.io.*;

public class Backjun3460 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				int target = Integer.parseInt(br.readLine());
				
				//이진수 변환
				StringBuffer binary = new StringBuffer(Integer.toBinaryString(target));
				binary = binary.reverse();
				for(int j=0;j<binary.length();j++) {
					char ch = binary.charAt(j);
					if(ch == '1') {
						System.out.print(j +" ");
					}
				}
				System.out.println();
			}
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

