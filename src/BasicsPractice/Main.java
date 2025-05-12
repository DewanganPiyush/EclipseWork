package BasicsPractice;

public class Main {

	public static void main(String[] args) {
		
		String str = "aevghgvpbab";
        int start =0, end =0;

        for (int i = 0; i < str.length(); i++) {
            int len1 = isPalindrome(str,i, i);
            int len2 = isPalindrome(str, i, i+1);
            int len = Math.max(len1,len2);
            
            if(len > end - start) {
            	start = i - (len-1)/2;
            	end = i + len/2;
            }
                
            
        }
        System.out.println("Longest palindrome substring is " + (str.substring(start, end + 1)));



	}

	private static int isPalindrome(String s, int i, int j) {
		while (i>=0 && j<s.length() && s.charAt(i)== s.charAt(j)) {
			i--;
			j++;
		}
		return j-i-1;
	}

}
