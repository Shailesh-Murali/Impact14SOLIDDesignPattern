package Assignment.one;

import java.util.List;
import java.util.stream.Collectors;

import Assignment.one.dao.DiscountMaster;
import Assignment.one.model.Discount;

public class BookMyMovie {
	
	private int movieId;
	private int noOftickets;
	private double discount;
	private double totalAmount;
	
	
	public BookMyMovie(int movieId, int noOftickets) {
		this.movieId = movieId;
		this.noOftickets = noOftickets;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getNoOftickets() {
		return noOftickets;
	}
	public void setNoOftickets(int noOftickets) {
		this.noOftickets = noOftickets;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	public void calculateDiscount() throws IndexOutOfBoundsException {
		List<Discount> discountList=DiscountMaster.getDiscountMaster();
		
		this.discount=discountList.stream().filter(d-> 
		{
			if(d.getMovieId()==this.movieId && (this.noOftickets>=d.getNoOfticketsLB() && this.noOftickets<d.getNoOfticketsUB()))
				return true;
			return false;
		}
		).collect(Collectors.toList()).get(0).getDiscount();
				
	}
	
	public double calculateTicketAmount() {
		try {
		this.calculateDiscount();
		int baseFare=DiscountMaster.getBaseFare().get(this.movieId);
		this.totalAmount= (baseFare*this.noOftickets) -(baseFare*this.noOftickets * (this.discount/100));
		}
		catch(Exception e){
			System.out.println("Sorry Invalid Movie ID");
			System.out.println("Please check Movie ID and enter once again");
			
		}
		
		return this.totalAmount;
		
	}
	
	
	
	

}
