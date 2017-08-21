
public abstract class Card {
	
	protected double interest;
	protected double balance = 100;
	
	public Card(){}
		
	public abstract double getTotal();
	
	public abstract double getTotalInterest();
}
