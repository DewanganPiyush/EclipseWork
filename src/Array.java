
public class Array {

	public static void main(String[] args) {
		
		
		int[][] arr = new int[4][4];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int k=0; k<arr.length;k++) {
			arr[k][k] = 1;
			arr[k][arr.length-1-k] = 1;
			
		}
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
		
		
	}

}
