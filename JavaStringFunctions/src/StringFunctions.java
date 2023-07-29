
public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = " abcde FGHI aAaa abcde   ";
		String food = "Pizza Pasta Sushi";
		// FUNCTIONS
		
		// Function toLowerCase(); makes the whole characters in a String lower case.
		String functionToLowerCase = phrase.toLowerCase();
		// Function toUpperCase(); makes all the characters in a String lower case
		String functionToUpperCase = phrase.toUpperCase();
		// Function trim(); deletes all the white spaces present in a String
		String functionTrim = phrase.trim();
		// Function substring() will only show characters from the number passed to the parameter
		String functionSubstring = phrase.substring(2);
		// Function substring() passing 2 parameters will only show the character from the position of the number informed till the second parameter position in the string
		String functionSubstring2 = phrase.substring(2, 9);
		// Function replace(); replace determined char with another char set as the second parameter
		String functionReplace = phrase.replace('a', 'x');
		// Function replace(); 2 parameters change the chain of characters (string) to a determined String chars set in the second parameter
		String functionReplace2 = phrase.replace("abcde", "xy");
		// Function indexOf(); return the number (position) of the first chaining or chars present in the parameters
		int functionIndexOf = phrase.indexOf("bc");
		// Function lastIndexOf() returns the number (position) of the last chars inserted as parameteres
		int functionLastIndexOf = phrase.lastIndexOf("bc");
		// Function split();'will cut the strings that are separed by white spaces in a string and get those 
		String[] vector = food.split(" ");
		
		// OUTPUTS
		System.out.println("Original String -> -" + phrase + "-");
		System.out.println("toLowerCase -> -" + functionToLowerCase + "-");
		System.out.println("toUpperCase -> -" + functionToUpperCase + "-");
		System.out.println("trim -> -" + functionTrim + "-");
		System.out.println("substring(2) -> -" + functionSubstring + "-");
		System.out.println("substring(2, 9) -> -" + functionSubstring2 + "-");
		System.out.println("replace('a', 'x') -> -" + functionReplace + "-");
		System.out.println("replace('abcde', 'xy') -> -" + functionReplace2 + "-");
		System.out.println("indexOf('bc') -> index of 'bc': " + functionIndexOf);
		System.out.println("lastIndexOf('bc') -> Last index of 'bc' -> " + functionLastIndexOf);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}

}
