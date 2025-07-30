package Assignment_5.entityassignment1;
import java.util.*;


public class ExecutionDemo {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        String bookingDetails = sc.nextLine();
        String[] parts = bookingDetails.split(",");

 
        TicketBooking booking = new TicketBooking(
                parts[0], 
                parts[1], 
                Integer.parseInt(parts[2]) 
        );

        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;

            case 2: 
                double walletAmount = sc.nextDouble();
                sc.nextLine(); 
                String walletNumber = sc.nextLine();
                booking.makePayment(walletNumber, walletAmount);
                break;

            case 3: 
                sc.nextLine(); 
                String holderName = sc.nextLine();
                double cardAmount = sc.nextDouble();
                sc.nextLine(); 
                String creditCardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(creditCardType, ccv, holderName, cardAmount);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
