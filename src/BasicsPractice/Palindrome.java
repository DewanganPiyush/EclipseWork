package BasicsPractice;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		int s = 0;
		int e = str.length()-1;
		
		while(s<e) {
			if(str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "PIYUSH";
		if(isPalindrome(str)) {
			System.out.println("The string is a palindrome");
		}
		else {
			System.out.println("The string is not a palindrome");
		}

	}

}
