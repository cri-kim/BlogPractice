/* *
 * 2020.11.11
 * 나동빈, 이것이 취업을 위한 코딩테스트다.
 * 재귀적으로 factorial 구하기
 * 
 * */
public class Factorial {

	public void solution() {
		int n=5;
		System.out.println(factorial_recursive(n));
	}
	public int factorial_recursive(int n) {
		if(n <= 1) return 1;
		return n * factorial_recursive(n-1);
	}
}