package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

/**
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 
 * 명령은 총 여섯 가지이다.
 * 
 * push X: 정수 X를 큐에 넣는 연산이다. pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 
 * 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. 
 * size: 큐에 들어있는 정수의 개수를 출력한다. 
 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
 * front: 큐의 가장 앞에 있는 정수를 출력한다. 
 * 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 
 * 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class Backjun10845 {

	//1.배열로 원형 큐를 만들어보자.
	private static int[] queue;
	private static int size;
	private static int back = -1; // = rear
	private static int front = -1;
	private static int queueSize = 0;
	
	@Test
	public void test() {
		setSize(10000);
		execute("push 20000");
		for( int i=0;i<size/3;i++) {
			execute("push 100000");
			execute("pop");
			execute("empty");
		}
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			setSize(Integer.valueOf(str));
			
			//명령어 수만큼 큐에 대한 명령을 실행한다.
			for(int i=0;i<size ; i++) {
				execute(br.readLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//2. 명령의 수/큐의 사이즈를 저장한다.
	public static void setSize(int sz) {
		size = sz;
		//주어지는 사이즈보다 큐의 사이즈가 커질 수 없다.
		//사이즈를 큐의 데이터로 하자
		queue = new int[sz+1];
	}
	
	//3. 명령을 실행한다.
	public static void execute(String str) {
		//공백으로 명령을 나눈다.
		String[] arr = str.split(" ");
		String command = arr[0];
		int x = arr.length>1 ? Integer.valueOf(arr[1]):0;
		
		if(command.equals("push")) {
			push(x);
		}
		else if(command.equals("front")) {
			if(empty()==0) {
				System.out.println(queue[front]);
			}
			else {
				System.out.println(-1);
			}
		}
		else if(command.equals("back")) {
			if(empty()==0) {
				System.out.println(queue[back]);
			}
			else {
				System.out.println(-1);
			}
		}
		else if(command.equals("size")) {
			System.out.println(size());
		}
		else if(command.equals("empty")) {
			System.out.println(empty());
		}
		else if(command.equals("pop")) {
			System.out.println(pop());
		}
	}
	
	public static void push(int x) {
		if(size() == queue.length) {
			//full
			return;
		}
		else if(empty() == 1) {
			queue[++back] = x;
			front++;
		}
		else {
			queue[++back] = x;
		}
		queueSize++;
	}
	public static int pop() {
		int v = -1;
		if(empty() == 1) {
			return -1;
		}
		else if(front == back) {
			v = queue[front];
			back = -1;
			front = -1;
			queueSize=0;
		}
		else {
			v = queue[front++];
			queueSize--;
		}
		return v;
	}
	public static int size() {
		return queueSize;
	}
	public static int empty() {
		if(queueSize == 0) {
			return 1;
		}
		return 0;
	}
}
