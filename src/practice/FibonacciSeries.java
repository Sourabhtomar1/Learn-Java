package practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fibo(n));

	}
	public static int fibo(int n) {
		if(n>=0) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

}
