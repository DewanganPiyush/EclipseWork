
public class Demo {
	
	public static boolean isPrime(int n) {
		
		if(n<2) {
			return false;
		}
		else{
			for (int i=2; i<=Math.sqrt(n); i++){
				if(n%i == 0) {
					return false;
				}
				return true;
			}
		}
	
	
	

	public static void main(String[] args) {
		
		int n = 7;
		if(isPrime(n)) {
			System.out.print("prime Number");
		}else {
			System.out.print("Not a prime Number");
		}

	}

}
