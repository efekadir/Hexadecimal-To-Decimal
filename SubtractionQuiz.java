import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int correct = 0;
		int question = 1;
		while (question < 6) {
			int n1 = (int)(Math.random() * 100);
			int n2 = (int)(Math.random() * 100);
			System.out.print(question + ") What is " + n1 + " - " + n2 + " = ? ");
			int answer = sc.nextInt();
			if (answer == n1 - n2) {
				correct++;
				System.out.println("True!");
			}
			else {
				System.out.println("False.");
			}
			question++;
		}
		
		switch (correct){
			case 0: System.out.println("You have 0 correct answers. You are so bad."); break;
			case 1: System.out.println("You have 1 correct answer. You are bad."); break;
			case 2: System.out.println("You have 2 correct answers. You are average."); break;
			case 3: System.out.println("You have 3 correct answers. You are okay."); break;
			case 4: System.out.println("You have 4 correct answers. You are good."); break;
			case 5: System.out.println("You have 5 correct answers. You are unbelievable!"); break;
		}
	}
}