package practice;

public class Recursion {

	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=1;
		for(int i=1;i<=7;i++) {
			result=result*i;
		}
		System.out.println("factorial using iterative way :- "+result);
		System.out.println("factorial using recursive way :- "+fact(7));
	}

}
