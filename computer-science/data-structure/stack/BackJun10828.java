package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * */
public class BackJun10828 {
	private static int commandCount;
	private static List<Integer> stack = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			setCommandCount(Integer.valueOf(str));
			for(int i=0;i<commandCount ; i++) {
				execute(br.readLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void setCommandCount(int cmdCnt) {
		commandCount = cmdCnt;
	}
	
	public static void execute(String str) {
		String[] strArr = str.split(" ");
		String cmd = strArr[0];
		String num = strArr.length > 1 ? strArr[1]: null;
		
		if(cmd.equals("push")) {
			push(Integer.valueOf(num));
		}
		else if(cmd.equals("pop")) {
			System.out.println(pop());
		}
		else if(cmd.equals("size")) {
			System.out.println(size());
		}
		else if(cmd.equals("empty")) {
			System.out.println(empty());
		}
		else if(cmd.equals("top")) {
			System.out.println(top());
		}
	}
	public static void push(int e) {
		stack.add(e);
	}
	public static int pop() {
		int top = top();
		if(empty() == 0) {
			stack.remove(size()-1);
		}
		return top;
	}
	public static int size() {
		return stack.size();
	}
	public static int empty() {
		int empty = 1;
		if(size() > 0) {
			empty = 0;
		}
		return empty;
	}
	public static int top() {
		int top = -1;
		if(empty() == 0) {
			top = stack.get(size()-1);
		}
		return top;
	}
	
	
	@Test
	public void test() {
		setCommandCount(14);
		execute("push 1");
		execute("push 2");
		execute("top");
		execute("size");
		execute("empty");
		execute("pop");
		execute("pop");
		execute("pop");
		execute("size");
		execute("empty");
		execute("pop");
		execute("push 3");
		execute("empty");
		execute("top");
	}
}
