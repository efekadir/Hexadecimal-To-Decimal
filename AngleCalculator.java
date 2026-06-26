import java.util.Scanner;

public class AngleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x1 coordinate: ");
		int x1 = sc.nextInt();
		System.out.print("Enter y1 coordinate: ");
		int y1 = sc.nextInt();
		System.out.print("Enter x2 coordinate: ");
		int x2 = sc.nextInt();
		System.out.print("Enter y2 coordinate: ");
		int y2 = sc.nextInt();
		System.out.print("Enter x3 coordinate: ");
		int x3 = sc.nextInt();
		System.out.print("Enter y3 coordinate: ");
		int y3 = sc.nextInt();
		
		double a = Math.sqrt(Math.pow(y2 - y3, 2) + Math.pow(x2 - x3, 2));
		double b = Math.sqrt(Math.pow(y1 - y3, 2) + Math.pow(x1 - x3, 2));
		double c = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
		
		double aDegree = Math.toDegrees(Math.acos((Math.pow(c, 2) + Math.pow(b, 2) - Math.pow(a, 2)) / (2*c*b)));
		double bDegree = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2*a*c)));
		double cDegree = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2*a*b)));
		
		System.out.println("The three angles are " + 
			      Math.round(aDegree * 100) / 100.0 + " " +
			      Math.round(bDegree * 100) / 100.0 + " " + 
			      Math.round(cDegree * 100) / 100.0);
	}

}
