import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
세준이는 양수와 +, -, 그리고 괄호를 가지고 식을 만들었다. 
그리고 나서 세준이는 괄호를 모두 지웠다.
그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.
괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.

role
첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고,
 가장 처음과 마지막 문자는 숫자이다. 
 그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 
 5자리보다 많이 연속되는 숫자는 없다.
 수는 0으로 시작할 수 있다. 
입력으로 주어지는 식의 길이는 50보다 작거나 같다.
*/
public class Backjun1541 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			//1. 식 입력
			String input = br.readLine();
			//2. -값으로 분리
			String[] arr = input.split("\\-");
			//3. 마이너스 값이 아닌 경우, 전부 더하기
			int result = sum(arr[0]);
			for(int i=1;i < arr.length;i++) {
				//4. 마이너스 값이 아닌 경우, 전부 더하기
				//5. 기본 값에서 빼기
				result -= sum(arr[i]);
			}
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int sum(String str) {
		return Arrays.asList(str.split("\\+"))
				.stream().mapToInt(i->Integer.parseInt(i)).sum();
	}
}
