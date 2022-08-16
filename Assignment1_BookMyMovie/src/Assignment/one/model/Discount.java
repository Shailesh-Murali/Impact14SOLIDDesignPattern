package Assignment.one.model;

public class Discount {
	
	private int movieId;
	private int noOfticketsLB;
	private int noOfticketsUB;
	private double discount;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
	public int getNoOfticketsLB() {
		return noOfticketsLB;
	}
	public void setNoOfticketsLB(int noOfticketsLB) {
		this.noOfticketsLB = noOfticketsLB;
	}
	public int getNoOfticketsUB() {
		return noOfticketsUB;
	}
	public void setNoOfticketsUB(int noOfticketsUB) {
		this.noOfticketsUB = noOfticketsUB;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public Discount(int movieId, int noOfticketsLB, int noOfticketsUB, double discount) {
		this.movieId = movieId;
		this.noOfticketsLB = noOfticketsLB;
		this.noOfticketsUB = noOfticketsUB;
		this.discount = discount;
	}
	
	

}
