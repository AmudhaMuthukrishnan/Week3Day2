package Week3.day2;

//Assignment #3 on string Palindrome
public class Palindrome {
	
	
	public static void main(String[] args) {
		String value = "madam";
		String rev  = "";
		
		
		int len = value.length();
		for (int i = len-1; i >=0; i--) {
			rev = rev + value.charAt(i);
			
		}
		System.out.println(rev);
		
		if(value.equals(rev))
			System.out.println("String is a palindrome");
		else {
			System.out.println("String is not palindrome");
		}
	}

}

