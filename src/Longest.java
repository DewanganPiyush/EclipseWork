
public class Longest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longest = "";
		String str = "I Love Dog";
		String strs[] = str.split(" ");
		
		for(int i=0; i<strs.length; i++) {
			if(strs[i].length() > longest.length()) {
				longest = strs[i];
			}
		}
		
		
	
		System.out.print(longest);
		
	
		
	
	}

	
}
