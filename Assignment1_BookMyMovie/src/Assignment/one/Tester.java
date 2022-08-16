package Assignment.one;

public class Tester {

	public static void main(String[] args) {
		BookMyMovie m1= new BookMyMovie(101, 5);
		System.out.println("Total amount for booking: "+m1.calculateTicketAmount());
		
		BookMyMovie m2= new BookMyMovie(102, 4);
		System.out.println("Total amount for booking: "+m2.calculateTicketAmount());
		
		BookMyMovie m3= new BookMyMovie(103, 8);
		System.out.println("Total amount for booking: "+m3.calculateTicketAmount());
		
		BookMyMovie m4= new BookMyMovie(104, 8);
		System.out.println("Total amount for booking: "+m4.calculateTicketAmount());
	}

}
