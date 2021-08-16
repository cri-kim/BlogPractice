package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import org.junit.jupiter.api.Test;

/**
 * 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 그
 * 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 한 쌍의 괄호 기호로 된 “(
 * )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다.
 * 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 예를 들어 “(())()”와
 * “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다.
 * 
 * 여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.
 */
public class Backjun9012 {
	private static int cnt=0;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			setCnt(Integer.valueOf(str));
			
			for(int i=0;i<cnt ; i++) {
				checkVps(br.readLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//입력 횟수 저장
	public static void setCnt(int count) {
		cnt = count;
	}
	
	//올바른 괄호 문자열 확인
	public static void checkVps(String ps) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch : ps.toCharArray()) {
			if(stack.isEmpty()) {
				stack.push(ch);
			}
			else {
				if(stack.size() == 1 && stack.peek() == ')') {
					break;
				}
				if(stack.peek() == ch) {
					stack.push(ch);
				}
				else {
					stack.pop();
				}
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	@Test
	public void tests() {
		String str = "6";
		setCnt(Integer.valueOf(str));
		
		checkVps("(())())");
		checkVps("(((()())()");
		checkVps("(()())((()))");
		checkVps("((()()(()))(((())))()");
		checkVps("()()()()(()()())()");
		checkVps("(()((())()(");

		System.out.println("---------------------");
		str = "3";
		setCnt(Integer.valueOf(str));
		
		
		checkVps("((");
		checkVps("))");
		checkVps("())(()");
	}

}
