package Week3.day2;
//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
public class ReverseEvenWords {
	
	public static void main(String[] args) {
		
	String test = "I am a software tester";
	
	String[] split = test.split(" ");
		
	
	int len = split.length;
	
	for(int i =0; i<len; i++)
	{
		if(i%2 == 0)
		{
			System.out.print(" " );
			String string = split[i];
			System.out.print(string + " " );
			
		}
		
		else {
		
			String string = split[i];
		//	System.out.print(string);
			System.out.print("");
			for (int j = string.length()-1; j >=0; j--) {
				char charAt1 = string.charAt(j);
				
				String s = String.valueOf(charAt1);
				System.out.print(s);
				System.out.print("");
						
		}
	
	}
			
	}
}
}
	
		
	
	

	


