package practice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,2,2,3,3,4};
		int key=2;
		int ind=iter(arr,key);
		int len=arr.length;
		int ind1=rec(arr,key,0,len);
		System.out.println(ind);
		System.out.println(ind1);
	}
	public static int rec(int arr[],int key,int l,int h) {
		if(l>h) {
			
			return -1;
		}
		int mid=(l+h)/2;
		if(arr[mid]==key) {
			return mid;
		}
		else if(arr[mid]>key) {
			return rec(arr,key,l,mid-1);
		}else if(arr[mid]<key) {
			return rec(arr,key,mid+1,h);
		}
		return -1;
		
	}
	public static int iter(int arr[],int key) {
		int l=0;
		int h=arr.length;
		while(l<h) {
			int mid=(l+h)/2;
			if(arr[mid]==key) {
				return mid;
				
			}else if(arr[mid]>key) {
				h=mid-1;
			}else if(arr[mid]<key) {
				l=mid+1;
			}
		}
		return -1;
		
	}

}
