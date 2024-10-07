import java.util.Scanner;
public class IT24102226Lab7Q1B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for (int student = 1; student <= 3; student++) {
			System.out.print("Enter Marks: " +student);
			int sub1 = input.nextInt();
			int sub2 = input.nextInt();
			int sub3 = input.nextInt();
			int sub4 = input.nextInt();
		
			double avg = (sub1 + sub2 + sub3 + sub4)/4.0;
			
			String grade;
			if (avg >= 75 && avg <= 100){
				grade = "Distinction";
			} else if (avg >= 50 && avg <= 75){
				grade = "Credit";
			} else if (avg >= 0 && avg <= 49){
				grade = "Fail";
			} else {
				grade = "invalid marks";
			}
			
			System.out.println("Average is: "+avg);
			System.out.println("Overall Grade is: "+grade);
		}
	}
			
			
}
			
			
			