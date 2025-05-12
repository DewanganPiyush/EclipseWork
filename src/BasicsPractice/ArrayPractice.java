package BasicsPractice;

public class ArrayPractice {

	public static void main(String[] args) {
		
		//1D array
        int[] numbers = {1, 2, 3, 4, 5};

        
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Summing the elements in the 1D array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of elements in the array: " + sum);
       
        //2D array
     // Declaring and initializing a 2D array (3x3 matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Print a new line after each row
        }

        // Summing the elements in the 2D array
        int add = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                add += matrix[i][j];
            }
        }
        System.out.println("Sum of elements in the 2D array: " + add);
        
        
     // 2d array with different example
        int[][] jaggedArray = {
            {1, 2},      
            {3, 4, 5},   
            {6, 7, 8, 9} 
        };

        
        System.out.println("Elements of the jagged 2D array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); 
        }

        // Summing the elements 
        int Sum = 0;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                Sum += jaggedArray[i][j];
            }
        }
        System.out.println("Sum of elements in the 2D array: " + Sum);

	}

}
