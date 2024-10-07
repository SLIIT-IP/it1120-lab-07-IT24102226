import java.util.Scanner;
public class IT24102226Lab7Q1A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks for four subjects: ");
		
		System.out.println("Enter subject Mark 1: ");
		int sub1 = input.nextInt();
		
		System.out.println("Enter subject Mark 2: ");
		int sub2 = input.nextInt();
		
		System.out.println("Enter subject Mark 3: ");
		int sub3 = input.nextInt();
		
		System.out.println("Enter subject Mark 4: ");
		int sub4 = input.nextInt();
		
		double avg = (sub1 + sub2 + sub3 + sub4)/4.0;
		
		String grade;
		if (avg >= 75 && avg <= 100) {
			grade = "Distinction";
		} else if (avg >= 50 && avg <= 74) {
			grade = "Credit";
		} else if (avg >= 0 && avg <= 49) {
			grade = "Fail";
		} else {
			grade = "invalid marks";
		}
		
		System.out.println("Average is : "+ avg);
		System.out.println("Overall Grade is : "+grade);
		
	}
}
		
		
		
		
		