package practice;

public class SelectionSort {
	public static void selection(int [] arr) {
			int n=arr.length;
			for(int i=0;i<n-1;i++) {
				int minindex=i;
				for(int j=i+1;j<n;j++) {
					if(arr[j]<arr[minindex]) {
						minindex=j;
					}
				}
					int t=arr[i];
					arr[i]=arr[minindex];
					arr[minindex]=t;
				
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= {4,1,4,3,2};
			selection(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
			
	}

}
