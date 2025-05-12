
public class Data_type {

	public static void main(String[] args) {
		double a = 15.0;
		int b = 3;
		
		char operator = '*';
		
		double ans;
		
		switch(operator) {
			case '+':
				ans = a + b;
				break;
				
			case '-':
				ans = a - b;
				break;
				
			case '*':
				ans = a * b;
				break;
				
			case '%':
				ans = a % b;
				break;
				
			case '/':
				if(b!=0) {
					ans = a / b;
					break;
				}
				else {
					System.out.println("cant be divided");
				}
				
				
			default:
				System.out.println("Invalid operator");
				return;
		}
		System.out.println(ans);
		

	}

}
