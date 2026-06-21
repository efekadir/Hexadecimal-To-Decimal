import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your weight in kilogram: ");
		double weight = sc.nextDouble();
		System.out.print("Enter your height in centimeter: ");
		double height = sc.nextDouble();
		double BMI = (int)(weight / Math.pow(height / 100, 2) * 100) / 100.0;
		
		if (BMI < 18.5)
			System.out.println("Your BMI is " + BMI + " and you are Underweight.");
		else if (18.5 <= BMI && BMI < 25.0)
			System.out.println("Your BMI is " + BMI + " and you are Normal.");
		else if (25.0 <= BMI && BMI < 30.0)
			System.out.println("Your BMI is " + BMI + " and you are Overweight.");
		else if (30.0 <= BMI)
			System.out.println("Your BMI is " + BMI + " and you are Obese.");
	}
}