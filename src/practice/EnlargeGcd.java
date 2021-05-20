package practice;

import java.util.*;
public class EnlargeGcd {
	public static int gcd(int a,int b) {
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		if(a>b) {
			return gcd(a%b,b);
		}
		if(b>a) {
			return gcd(a,b%a);
		}
		return 0;
		
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ans=0;
		for(int i=0;i<n;i++) {
			ans=gcd(ans,arr[i]);
		}
		System.out.print(ans);
		
	}
}
