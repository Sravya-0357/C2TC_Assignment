package Assignment_4.entityclassassignment1;
import java.util.*;

public class Executor {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int choice = sc.nextInt();
	     int hours = sc.nextInt();
	     double costPerHour = sc.nextDouble();
	     
	        Airfare a1=null; 

	        if (choice == 1) {
	            a1 = new AirIndia(hours,costPerHour);
	            
	        } else if (choice == 2) {
	        	   a1 = new Indigo(hours,costPerHour);
	        } 
	        else if (choice == 3) {
	        	   a1 = new KingFisher(hours,costPerHour);
	        }else {
	            System.out.println("Invalid choice.");
	        
	        }

	        double amount=a1.calculateAmount();
	        
	        System.out.printf("%.2f",amount);
	        
	      sc.close();
	       
	}

}
