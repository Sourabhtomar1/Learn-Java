/**
 * 
 */
package practice;

/**
 * @author Sourabh
 *
 */
public class InsertionSort {

	
	public static void insertionsort(int [] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int j=i;
			while(j>0&&arr[j]<arr[j-1]) {
				int t=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=t;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,1,4,3,2};
		insertionsort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
