package practice;

public class Arraysize {

	public static void main(String[] args) {
		int arr[]= {15,11,5,4,1,2,3 ,-5,-2};
		
		int lessthanlow=0;
		int inrange=0;
		int greaterthanhigh=0;
		int low=4,high=7;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<low)
				lessthanlow++;
			else if(arr[i]>=low && arr[i]<=high)
				inrange++;
			else if(arr[i]>high)
				greaterthanhigh++;
			
		}
		int Anew[] = new int[lessthanlow];
		int Bnew[] = new int[inrange];
		int Cnew[] = new int[greaterthanhigh];
		
		lessthanlow=0;
		inrange=0;
		greaterthanhigh=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<low)
				Anew[lessthanlow++]=arr[i];
			else if(arr[i]>=low && arr[i]<=high)
				Bnew[inrange++]=arr[i];
			else if(arr[i]>high)
				Cnew[greaterthanhigh++]=arr[i];
		}
		int cnt=0,i=0;
		while(i<lessthanlow) {
			arr[cnt++]=	Anew[i++];
		}
		i=0;
		while(i<inrange) {
			arr[cnt++]=	Bnew[i++];
		}
		i=0;
		while(i<greaterthanhigh) {
			arr[cnt++]=	Cnew[i++];
		}
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			
	}

}
