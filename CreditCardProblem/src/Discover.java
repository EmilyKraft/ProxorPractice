
public class Discover extends Card{
	
	final double interest  = 0.01;
	
	public Discover(){}

	public double getTotal(){
		return balance + (balance*interest);
	} 
	
	public double getTotalInterest(){
		return balance*interest;
	}
}
