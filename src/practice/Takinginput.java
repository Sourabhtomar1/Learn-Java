package practice;

import java.util.Scanner;

public class Takinginput {
	
	public static void shift(int nums[]) {
		 int i=0;
		    int j=0;
		        
		    while(j<nums.length && i<nums.length)
		    {
		        while(i<nums.length && nums[i]!=0)
		        {
		            i++;
		        }
		        if( j>i)
		        {
		            int tmp=nums[i];
		            nums[i]=nums[j];
		            nums[j]=tmp;
		        }
		        j++;
		    }
	}
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int t;
		//t=input.nextInt();
		int [] nums = {0,0,1,3,12};
		shift(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
	}
	
}
