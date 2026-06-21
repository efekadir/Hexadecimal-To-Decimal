import java.util.Scanner;

public class CircleAreaComputer {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value (this number must not be a negative number): ");
		double radius = input.nextDouble();
		double area = radius * radius * Math.PI;
		
		if (radius >= 0)
			System.out.println("The area of circle is: " + area);
			else
				System.out.println("Negative input");
	}
}