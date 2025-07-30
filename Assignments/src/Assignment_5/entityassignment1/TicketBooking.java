package Assignment_5.entityassignment1;

public class TicketBooking {
	
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public TicketBooking() {
	}
	
	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	
	public void makePayment(Double amount)
	{
		   displayBookingDetails();
	        System.out.printf("Amount %.1f paid in cash\n", amount);
	}
	
	public void makePayment(String walletNumber,Double amount)
	{
		 displayBookingDetails();
	     System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
	}
	
	public void makePayment(String creditCard,String ccv,String name,Double amount)
	{
		displayBookingDetails();
        System.out.println("Holder name:" + name);
        System.out.printf("Amount %.1f paid using %s card\n", amount, creditCard);
        System.out.println("CCV:" + ccv);
	}
	 private void displayBookingDetails() {
	        System.out.println("Stage event:" + stageEvent);
	        System.out.println("Customer:" + customer);
	        System.out.println("Number of seats:" + noOfSeats);
	    }
	
}
