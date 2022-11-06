package application;
import java.util.Random;
public class Password {
	Random rand = new Random();
	
	private int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	private String[] arrayLetters = {"a", "b", "c", "d", "e", "f","g","k","l","m","n","o","p", "q", "r", "s", "s", "t", "u", "v", "w", "x", "y","z"};
	private String[] arraySpecialChar = {"!", "@", "#", "$", "%", "&", "*", "(", ")", "-", "_", "+", "=", "~", "^", "`", "]", "[", "}", "{", "'", ",", ".", ";"};
	
	public void getNumber() {
		int size = 9;
	return int number = rand.nextInt(9);
	}
	
	
}
