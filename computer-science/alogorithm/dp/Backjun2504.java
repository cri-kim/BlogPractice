import java.io.*;
import java.util.Stack;

public class Main {
	private final static int PARENTHESES = 2; // 소괄호
	private final static int BRAKETS = 3; // 대괄호

	private static int temp = 1;

	public static void main(String[] args) {
		boolean impossible = false;
		int result = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			char[] input = br.readLine().toCharArray();
			Stack<Character> s = new Stack<Character>();
			for (int i = 0; i < input.length; i++) {
				char ch = input[i];
				if (ch == '(') {
					temp *= PARENTHESES;
					s.push(ch);
				}
				// 불가능한 경우
				else if (input[i] == ')' && (s.empty() || s.peek() != '(')) {
					impossible = true;
					break;
				} else if (input[i] == ']' && (s.empty() || s.peek() != '[')) {
					impossible = true;
					break;
				}
				else if (ch == '[') {
					temp *= BRAKETS;
					s.push(ch);
				} else if (ch == ']') {
					if(input[i-1] == '[') {
						result+=temp;
					}
					s.pop();
					temp/=BRAKETS;

				} else if (ch == ')') {
					if(input[i-1] == '(') {
						result+=temp;
					}
					s.pop();
					temp/=PARENTHESES;
				}
			}
			if(impossible || !s.isEmpty()) {
				System.out.println("0");
			}
			else {
				System.out.println(result);
			}

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
