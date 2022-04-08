package Week3.day2;
//Assignment on find types
public class FindTypes {
	
	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] charArray = test.toCharArray();
				
		for (int i = 0; i < charArray.length; i++) {
			
			char charAt = test.charAt(i);
			
			if(Character.isLetter(charAt))
			{
				letter = letter +1;
			}else if(Character.isDigit(charAt))
			{
				num = num + 1;
			}else if(Character.isSpace(charAt))
			{
				space = space + 1;
			}else {
				specialChar = specialChar +1;
			}
	}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

}
}
