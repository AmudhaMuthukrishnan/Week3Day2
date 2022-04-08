package Week3.day2;

import java.util.Arrays;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

//Assignment #3 on string Anagram
public class Anagram {
	
	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		
		int len1 = text1.length();
		int len2 = text2.length();
				
		if(len1 == len2)
				{
			
			 char[] charArray1 = text1.toCharArray();
			 char[] charArray2 = text2.toCharArray();
					 
			 Arrays.sort(charArray1);
			 Arrays.sort(charArray2);
			 
			String string = new String(charArray1);
			String string1 = new String(charArray2);
			
			if(string.equals(string1))
			{
				System.out.println("Both the strings are equal");
			}
			 
			System.out.println(string);
			System.out.println(string1);
			 
			
				}
		
	}

}
