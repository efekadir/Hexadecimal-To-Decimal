import java.util.Scanner;

public class HexadecimalToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a hexadecimal value: ");
		String hex = sc.next();
		
		if (hex.length() != 1) {
			System.out.println("Please enter only one character.");
			System.exit(0);
		}
		char ch = hex.toUpperCase().charAt(0);
		if ('A' <= ch && ch <= 'F') {
			int value = ch - 'A' + 10;
			System.out.println("The decimal value for hexadecimal digit " + ch + " is " + value);
		}
		else if (Character.isDigit(ch)) {
			System.out.println("The decimal value for hexadecimal digit " + ch + " is " + ch);
		}
		else {
			System.out.println("Please enter a one digit number or one of these letters: A, B, C, D, E, F");
		}
	}
}