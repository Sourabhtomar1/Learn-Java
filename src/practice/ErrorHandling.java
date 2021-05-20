package practice;

public class ErrorHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {10 , 20 ,30 ,40 ,50,60,70,80};
		int deno[]= {1,0,3,0,5,0};
		for(int i=0;i<num.length;i++) {
			try {
				System.out.println(num[i]/deno[i]);
			}
			catch(ArithmeticException e) {
				System.out.println("Math Error");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("NOT IN RANGE");
			}
		}
	}
}