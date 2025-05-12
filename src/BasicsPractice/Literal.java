package BasicsPractice;

public class Literal {

	public static void main(String[] args) {
		
		// single character literal within single quote
		char ch = 'a';
		// It is an Integer literal with octal form
		
		// Unicode representation
		char c = '\u0061';

		System.out.println(ch);
		
		System.out.println(c);

		// Escape character literal
		System.out.println("\" is a symbol");
		
		
		// TODO Auto-generated method stub
		        
		        // Numeric Literals
		      int integerLiteral = 42;              
		      double floatingPointLiteral = 3.14;    
		      int binaryLiteral = 0b101010;          
		      int hexadecimalLiteral = 0x2A;         

		      System.out.println("Integer Literal: " + integerLiteral);
		      System.out.println("Floating-point Literal: " + floatingPointLiteral);
		      System.out.println("Binary Literal: " + binaryLiteral);
		      System.out.println("Hexadecimal Literal: " + hexadecimalLiteral);

		        // Character Literals
		      char characterLiteral = 'A';           
		      char escapeCharacter = '\n';           

		      System.out.println("Character Literal: " + characterLiteral);
		      System.out.println("Escape Character (newline): '" + escapeCharacter + "'");

		        // String Literals
		       String stringLiteral = "Hello, World!"; 
		       String multilineString = "This is\n" + 
		                                 "a multiline\n" + 
		                                 "string.";        
		       String escapeSequenceInString = "This is a tab:\tTab space"; 

		        System.out.println("String Literal: " + stringLiteral);
		        System.out.println("Multiline String: " + multilineString);
		        System.out.println("String with Escape Sequence: " + escapeSequenceInString);
		
		        int f = '0';
				int s = '7';
				System.out.println("the" + f + '2'+ s);
				

			}

	}


