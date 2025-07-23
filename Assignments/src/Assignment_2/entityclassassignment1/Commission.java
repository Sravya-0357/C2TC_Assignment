package Assignment_2.entityclassassignment1;
import java.util.Scanner;

public class Commission {
    String name;
    String address;
    String phone;
    double salesAmount;
    public Commission() {
        System.out.println("Student object is created");
    }

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
        sc.close();
    }

    public void calculateCommission() {
        double commission;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("Name : " + name);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    } 
}