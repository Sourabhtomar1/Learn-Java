package practice;

public class MergeSort {

	public static void merger(int []arr,int l,int mid,int h) {
		int i=l,j=mid,k=l;
		int temp[]=new int[100];
		while(i<mid&&j<=h) {
			if(arr[i]<arr[j]) {
				temp[k++]=arr[i++];
			}else {
				temp[k++]=arr[j++];
			}
		}
		while(i<mid) {
			temp[k++]=arr[i++];
		}
		while(j<=h) {
			temp[k++]=arr[j++];
		}
		for(i=l;i<=h;i++) {
			arr[i]=temp[i];
		}
		
	}
	public static void merge(int[] arr,int l,int h) {
		if(l<h) {
			int mid=l+(h-l)/2;
			merge(arr,l,mid);
			merge(arr,mid+1,h);
			merger(arr,l,mid+1,h);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,1,4,3,2};
		merge(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
