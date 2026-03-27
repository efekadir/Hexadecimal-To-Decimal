import java.util.Scanner;

public class HexadecimalToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter one digit value: ");
		String hex = sc.nextLine();
		
		if (hex.length() == 1) {
			hex = hex.toUpperCase();
			char ch = hex.charAt(0);

			if ('A' <= ch && ch <= 'F') {
				int answer = ch - 'A' + 10;
				System.out.println("Decimal value of " + hex + " is " + answer + ".");
			}
			else if ('0' <= ch && ch <= '9') {
				int answer = ch - '0';
				System.out.println("Decimal value of " + hex + " is " + answer + ".");
			}
			else {
				System.out.println("Enter a valid value.");
			}
		}
		else {
			System.out.println("Enter only one character.");
		}
	}
}
