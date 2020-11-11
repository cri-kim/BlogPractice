/* *
 * 2020.11.11
 * 나동빈, 이것이 취업을 위한 코딩테스트다.
 * 두개의 자연수에 대한 최대공약수를 구하기
 * 대표 알고리즘 : 유클리드 호제법
 * 
 * */
public class Gcd {

	public void solution() {
		int answer = 0;
		int a=192;
		int b=162;
		//a > b
		System.out.println(gcd(a,b));
	}
	public int gcd(int a, int b) {
		if(a%b ==0) return b;
		else return gcd(b, a%b);
	}
}
