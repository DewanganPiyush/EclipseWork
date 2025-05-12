package BasicsPractice;

public class StringPractice {

	public static void main(String[] args) {
		
		// 1. Creating Strings and Concatenation
        String str1 = "Hello, ";
        String str2 = "World!";
        String result = str1 + str2;
        System.out.println("Concatenation: " + result); 

        // 2. Length of a String
        String message = "Java Programming!";
        System.out.println("Length of the string: " + message.length()); 

        // 3. String Case Conversion: toUpperCase() and toLowerCase()
        String text = "Hello Java!";
        String upperText = text.toUpperCase();
        String lowerText = text.toLowerCase();
        System.out.println("Uppercase: " + upperText); 
        System.out.println("Lowercase: " + lowerText); 

        // 4. String Comparison: equals() and equalsIgnoreCase()
        String str3 = "hello";
        String str4 = "Hello";
        System.out.println("Are strings equal (case-sensitive)? " + str3.equals(str4)); 
        System.out.println("Are strings equal (case-insensitive)? " + str3.equalsIgnoreCase(str4)); 

        // 5. Substring Extraction
        String sentence = "Java Programming";
        String subText1 = sentence.substring(5);
        String subText2 = sentence.substring(5, 11);
        System.out.println("Substring from index 5: " + subText1); // Output: Programming
        System.out.println("Substring from index 5 to 11: " + subText2); // Output: Program

        // 6. Replacing Substrings
        String original = "Java is fun!";
        String replaced = original.replace("fun", "awesome");
        System.out.println("Replaced string: " + replaced); // Output: Java is awesome!

        // 7. Trimming Whitespace
        String textWithSpaces = "   Hello, World!   ";
        String trimmedText = textWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedText + "'"); // Output: 'Hello, World!'

        // 8. Using concat() Method
        String part1 = "Java ";
        String part2 = "Programming";
        String concatenatedText = part1.concat(part2);
        System.out.println("Concatenated using concat(): " + concatenatedText); // Output: Java Programming

        // 9. String Equality: == vs equals()
        String str5 = "hello";
        String str6 = "hello";
        String str7 = new String("hello");
        System.out.println("str5 == str6: " + (str5 == str6)); // Output: true (because both refer to the same object in memory)
        System.out.println("str5 == str7: " + (str5 == str7)); // Output: false (str7 is a new object)
        System.out.println("str5.equals(str6): " + str5.equals(str6)); // Output: true
        System.out.println("str5.equals(str7): " + str5.equals(str7)); // Output: true

        // 10. Typecasting char to int (ASCII Value)
        char character = 'A';
        int asciiValue = (int) character;
        System.out.println("ASCII value of 'A': " + asciiValue); // Output: 65

	}

}
