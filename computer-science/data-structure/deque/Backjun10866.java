package deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 
 * 명령은 총 여덟 가지이다.
 * 
 * push_front X: 정수 X를 덱의 앞에 넣는다. 
 * push_back X: 정수 X를 덱의 뒤에 넣는다. 
 * pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다.  만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다. 
 * pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다. 
 * size: 덱에 들어있는 정수의 개수를 출력한다. 
 * empty: 덱이 비어있으면 1을, 아니면 0을 출력한다. 
 * front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다. 
 * back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class Backjun10866 {
	
	@Test
	public void test() {
		dq = new LinkedList<Integer>();
		execute("push_back 1");
		execute("push_front 2");
		execute("front");
		execute("back");
		execute("size");
		execute("empty");
		execute("pop_front");
		execute("pop_back");
		execute("pop_front");
		execute("size");
		execute("empty");
		execute("pop_back");
		execute("push_front 3");
		execute("empty");
		execute("front");
	}
	
	private static List<Integer> dq;
	public static void main(String[] args) {
		int cnt = 0;
		dq = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			cnt = Integer.valueOf(str);
			
			//명령어 수만큼 큐에 대한 명령을 실행한다.
			for(int i=0;i<cnt ; i++) {
				execute(br.readLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void execute(String str) {
		//공백으로 명령을 나눈다.
		String[] arr = str.split(" ");
		String command = arr[0];
		int x = arr.length>1 ? Integer.valueOf(arr[1]):0;
		Deque deque = new Deque(dq);
		if(command.equals("push_back")) {
			deque.push_back(x);
		}else if(command.equals("push_front")) {
			deque.push_front(x);
		}else if(command.equals("front")) {
			System.out.println(deque.front());
		}else if(command.equals("back")) {
			System.out.println(deque.back());
		}else if(command.equals("size")) {
			System.out.println(deque.size());
		}else if(command.equals("empty")) {
			System.out.println(deque.empty());
		}else if(command.equals("pop_front")) {
			System.out.println(deque.pop_front());
		}else if(command.equals("pop_back")) {
			System.out.println(deque.pop_back());
		}
	}
}
class Deque {
	private List<Integer> deque;
	public Deque(List<Integer> d){
		this.deque = d;
	}
	//정수 x를 덱 앞에 넣는다.
	public  void push_front(int x) {
		deque.add(0, x);
	}
	//정수 x를 덱 뒤에 넣는다.
	public  void push_back(int x) {
		deque.add(x);
	}
	//덱의 가장 앞에 있는 수를 뺀다. 없는 경우 -1을 출력한다.
	public  int pop_front() {
		int v = -1;
		if(empty() == 1) {
		}
		else {
			v=front();
			deque.remove(0);
		}
		return v;
	}
	//덱의 가장 뒤에 있는 수를 뺀다. 없는 경우 -1을 출력한다.
	public  int pop_back() {
		int v = -1;
		if(empty() == 1) {
		}
		else {
			v=back();
			deque.remove(size()-1);
		}
		return v;
	}
	 
	public  int size() {
		return deque.size();
	}
	//덱이 비어있으면 1을, 아니면 0을 출력한다.
	public  int empty() {
		if(size() == 0) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	public  int front() {
		int v = -1;
		if(empty() == 1) {
		}
		else {
			v=deque.get(0);
		}
		return v;
	}
	public  int back() {

		int v = -1;
		if(empty() == 1) {
		}
		else {
			v=deque.get(size()-1);
		}
		return v;
	}
}
