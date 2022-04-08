package Week3.day2;
//Check number of occurrences of a char (eg 'e') in a String
public class CharOccurance {
	
	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		
		char checkChar = 'e';
				
		int count = 0;
		
		char[] charArray = str.toCharArray();
		
		int len = charArray.length;
		
		for(int i=0; i<len; i++)
		{
		 	char charAt = str.charAt(i);
		 	
		 	if(charAt == checkChar )
		 	{
		 		count = count + 1;
		 		
		 	}
		}
		System.out.println(checkChar);
		System.out.println(count);
	}

}
