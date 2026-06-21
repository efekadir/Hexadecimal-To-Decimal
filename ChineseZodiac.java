import java.util.Scanner; 

public class ChineseZodiac {
	public static void main(String[] args) {
	  	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year to display the animal for the year: ");
		int year = sc.nextInt();
	  	int numberOfYear = year % 12;
	  
		switch (numberOfYear) {
		case 0: System.out.println("You are Monkey.");
		break;
		case 1: System.out.println("You are Rooster.");
		break;
		case 2: System.out.println("You are Dog.");
		break;
		case 3: System.out.println("You are Pig.");
		break;
		case 4: System.out.println("You are Rat.");
		break;
		case 5: System.out.println("You are Ox.");
		break;
		case 6: System.out.println("You are Tiger.");
		break;
		case 7: System.out.println("You are Rabbit.");
		break;
		case 8: System.out.println("You are Dragon.");
		break;
		case 9: System.out.println("You are Snake.");
		break;
		case 10: System.out.println("You are Horse.");
		break;
		case 11: System.out.println("You are Sheep.");
		break;
		default : System.out.println("Please enter a positive number.");
		}
	}
}