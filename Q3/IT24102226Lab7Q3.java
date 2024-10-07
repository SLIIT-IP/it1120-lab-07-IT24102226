import java.util.Scanner;
public class IT24102226Lab7Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double discountrate = 0.05;
		
		for (int customer = 1; customer <= 5; customer++){
			System.out.println("Customer "+ customer +".");
			System.out.println("Enter total bill payment: ");
			double payment = input.nextDouble();
			
			System.out.println("Enter the mode of payment (C for cash, O for other): ");
			char paymentmethod = input.next().charAt(0);
			
			double discount = payment * discountrate;
			
			if (paymentmethod == 'C' || paymentmethod == 'c') {
				System.out.println("Discount is: " +discount);
			} else if (paymentmethod == 'O' || paymentmethod == 'o'){
				System.out.println("No discount applied");
			} else {
				System.out.println("Payment Mode is Not Valid");
			}
			
			double finalamount = payment - discount;
			System.out.println("Amount to be paid: " +finalamount +".");
		}
	}
}
			
				
				
				
			
			
			


			
			
		