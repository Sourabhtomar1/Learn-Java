package practice;

import java.util.Arrays;

public class _H4_StringPermutations
{
	public static void main(String[] args)
	{
		String s1 = "ab";
		String s2 = "eidbaooo";
		System.out.println(checkInclusion(s1, s2));
	}

// ----------------Leetcode submission---------------------//
	public static boolean checkInclusion(String s1, String s2)
	{
		int slidingLength = s2.length();
		int ws = s1.length();
		int[] hashedS1 = stringToHashArray(s1); // sliding window array
	//	System.out.println(Arrays.toString(hashedS1));
		
		for (int i = 0; i <= slidingLength - ws; i++)
		{
		// int[] hashedS2 = stringToHashArray(s2);
			int[] hashedS2 = new int[26];
			
			// window size chars
			int currWS = 0;
			
			for (int j = i; j < slidingLength && currWS < ws; j++)
			{
				if (currWS <= ws)
				{
					hashedS2[s2.charAt(j) - 'a']++;
					currWS++;
				}
				//System.out.println(Arrays.toString(hashedS2));
		
			}
	// System.out.println(Arrays.toString(hashedS1));
			//System.out.println(Arrays.toString(hashedS1));
			//System.out.println(Arrays.toString(hashedS2));
			boolean answer = hashArrayComparison(hashedS1, hashedS2);
			
			if (answer == true)
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean hashArrayComparison(int[] hashedS1, int[] hashedS2)
	{
		//System.out.println(Arrays.toString(hashedS1));
		//System.out.println(Arrays.toString(hashedS2));
		
		for (int i = 0; i < 26; i++)
		{
			if (hashedS1[i] != hashedS2[i])
			{
				return false;
			}
		}
		
		//System.out.println(Arrays.toString(hashedS1));
		//System.out.println(Arrays.toString(hashedS2));
			
		return true;
	}
		
		public static int[] stringToHashArray(String s1)
		{
			int[] hashArray = new int[26]; // handles a-z lowercases only
			
			for (int i = 0; i < s1.length(); i++)
			{
				hashArray[s1.charAt(i) - 'a']++;
			}
			return hashArray;
		}

}